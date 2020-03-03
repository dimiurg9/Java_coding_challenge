package coding.challenge.java;

public class ReverseStringBuffer {
    public static void main(String[] cla){
        int number = 12345;
        int original = number;
        StringBuffer string_buffer = new StringBuffer(String.valueOf(number));
        string_buffer.reverse();
        int reverse = Integer.parseInt(string_buffer.toString());
        System.out.println(original + " : " + reverse);
    }
}
