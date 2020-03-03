package coding.challenge.java;

public class SwapArifmeticAdvance {
    public static void main(String[] cla){
        int x = 5;
        int y = 10;
        System.out.println("Before swapping x = " + x + ", y = " + y);

        x += (y - (y = x));
        System.out.println("After swapping x = " + x + ", y = " + y);
    }
}
