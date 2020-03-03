package coding.challenge.java;

public class SwipeStringConcat {
    public static void main(String[] cla){

    String x = "abc";
    String y = "xyz";
    System.out.println("Before swapping x = "+ x +", y = "+y);
    y = x + y;
    x = y.substring(x.length());
    y = y.substring(0, y.length() - x.length());
        System.out.println("after swapping x = " + x + ", y = " + y);
}
}
