package givechange;

class Main {

    public static double GiveChange(CatalogItem[] catalogItems, OrderedItem[] orderedItems, double moneyProvided)
            throws IllegalArgumentException, ItemNotInCatalogException, InsufficientFundsException {

        if ((catalogItems == null) && (orderedItems == null)){
            return moneyProvided;
        }
        if (catalogItems == null){
            throw new ItemNotInCatalogException();
        }
        if (orderedItems == null){
            return moneyProvided;
        }
        if (moneyProvided < 0){
            throw new IllegalArgumentException();
        }

        double toReturn = 0.0;
        double orderedByCustomer = 0.0;

        for (int i = 0; i < orderedItems.length; i++) {
            if (orderedItems[i] == null){
                continue;
            }
            int orderedItemId = orderedItems[i].getId();
            if (orderedItemId > catalogItems.length){
                throw new ItemNotInCatalogException();
            }
            int orderedItemQuantity = orderedItems[i].getQuantity();
            for (int b = 0; b < catalogItems.length; b++) {
               if (catalogItems[b].getId() == orderedItemId) {
                    double catalogItemPrice = catalogItems[b].getPrice();
                    double moneySpendForItem = catalogItemPrice * orderedItemQuantity;
                    orderedByCustomer = orderedByCustomer + moneySpendForItem;
                    break;
                }
            }
        }
        if (moneyProvided <  orderedByCustomer){
            throw new InsufficientFundsException();
        }

        toReturn = moneyProvided - orderedByCustomer;
        return toReturn;
    }

    public static void main(String[] args) {
        TestRunner tr = new TestRunner();
        tr.main();
    }
}
