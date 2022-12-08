package mytools;

public class Binary {

    public static void main(String[] cla) {
        int x = 203;
        int y = 101;

        System.out.println(x + " in binary: " + Integer.toBinaryString(x));
        System.out.println(y + " in binary: " + Integer.toBinaryString(y));
        System.out.println(x + " & (AND) " + y + " = " + (x & y) + " in binary: " + Integer.toBinaryString(x & y));
        System.out.println(x + " | (OR) " + y + " = " + (x | y) + " in binary: " + Integer.toBinaryString(x | y));
        System.out.println(x + " ^ (XOR) " + y + " = " + (x ^ y) + " in binary: " + Integer.toBinaryString(x ^ y));
        System.out.println(" ~ (NOT) " + x + " = " + (~x));
        System.out.println(x + " << (Left Shift) " + y + " = " + (x << y) + " in binary: " + Integer.toBinaryString(x << y));
        System.out.println(x + " >> (Right Shift) " + y + " = " + (x >> y) + " in binary: " + Integer.toBinaryString(x >> y));

    }

}
