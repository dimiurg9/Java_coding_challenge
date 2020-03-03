package coding.challenge.java;

public class SwapTemporaryVar {
    public static void main(String[] cla){
        int x = 5;
        int y = 10;
        int temp;
        System.out.println("Before swapping: x = " + x + ", y =  " + y);

        temp = x;
        x = y;
        y = temp;
        System.out.println("After swapping: x = " + x + ", y = " + y);
    }
}
