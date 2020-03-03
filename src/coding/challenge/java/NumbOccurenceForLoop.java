package coding.challenge.java;

public class NumbOccurenceForLoop {
    public static void main(String[] cla){
        long number = 112233444L;
        long search = 4;

        String ns = String.valueOf(number);
        String ss = String.valueOf(search);
        int count = 0;
        for (int i = 0; i < ns.length(); i++){
            if (ns.charAt(i) == ss.charAt(0))
                count += 1;}
        System.out.println("number of occurence of: " + search + " in number: " + number + " is: " + count);
    }
}
