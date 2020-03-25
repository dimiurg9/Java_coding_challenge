package my_cc_java;

public class My_reverseForLoop {
    public static void main(String[] cla){
        int number = 12345;
        String result = "";
        String num = String.valueOf(number);
        for (int i = num.length() - 1; i >= 0; i--){
            result = result + num.charAt(i);
        }
        int reverse = Integer.parseInt(result);
        System.out.print(number + " : " + result);
    }
}
