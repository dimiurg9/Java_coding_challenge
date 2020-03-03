package coding.challenge.java;

public class ReverseWhileLoop {
    public static void main(String[] cla){
        int number = 12345;
        int original = number;
        int reverse = 0;
        while (number != 0){
            reverse = reverse*10;
            reverse = reverse + number % 10;
            number = number / 10;
        }
        System.out.println(original + " : " + reverse);
    }
}
