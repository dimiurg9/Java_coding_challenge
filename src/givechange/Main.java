package givechange;

class Main {

    // write your solution in this function
    public static double GiveChange(CatalogItem[] catalogItems, OrderedItem[] orderedItems, double moneyProvided)
            throws IllegalArgumentException, ItemNotInCatalogException, InsufficientFundsException {
        double changeExpected = 0.0;
        double totalOrdered = 0.0;
        try {
            if (moneyProvided < 0) {
                throw new IllegalArgumentException();
            }
            for (int i = 0; i < orderedItems.length; i++) {
                int orderedItemId = orderedItems[i].getId();
                int orderedItemQuantity = orderedItems[i].getQuantity();

                for (int b = 0; i < catalogItems.length; i++) {
                    int catalogItemId = catalogItems[b].getId();
                    double catalogItemPrice = catalogItems[b].getPrice();
                    if (orderedItemId == catalogItemId) {
                        // double price = catalogItems[b].getPrice();
                        double purchasedItem = catalogItemPrice * orderedItemQuantity;
                        totalOrdered = totalOrdered + purchasedItem;
                    }
                }
            }
            if (moneyProvided < 0){
                throw new InsufficientFundsException();
            }
            String s = "null";
            if (totalOrdered == 0.0){
                throw new ItemNotInCatalogException();
            }
        } catch (IllegalArgumentException e) {
            System.out.print(e.getMessage());
        } catch (ItemNotInCatalogException e){
            System.err.println(e.getMessage());
        } catch (InsufficientFundsException e){
            System.err.println(e.getMessage());
        }

        changeExpected = moneyProvided - totalOrdered;
        return changeExpected;
    }

    // do not change the following code
    public static void main(String[] args) {
        TestRunner tr = new TestRunner();
        tr.main();
    }
}
