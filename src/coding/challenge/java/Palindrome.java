package coding.challenge.java;

public class Palindrome {
    public static void main(String[] cla){
        int input = 6556;
        int reverse = 0;
        int origin = input;
        while (input > 0){
            reverse = reverse * 10 + input % 10;
            input = input / 10;}
        if (origin == reverse){System.out.println(origin + " is palindrome number");}
        else {System.out.println(origin + " is not palindrome number");}
    }
}
