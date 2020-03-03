package coding.challenge.java;

public class NumberOccurenceLoop {
    public static void main(String[] cla){
        long number = 1122334444L;
        long search = 4;

        String ns = String.valueOf(number);
        String ss = String.valueOf(search);
        int count = ns.length() - ns.replace(ss, "").length();
        System.out.println("Number of occurence of: " +
                search + " in number: " + number + "is: " + count);
    }
}
