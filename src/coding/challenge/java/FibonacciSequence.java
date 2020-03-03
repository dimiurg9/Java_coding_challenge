package coding.challenge.java;
import java.math.BigInteger;

public class FibonacciSequence {
    public static void main(String[] cla){
        int limit = 20;
        BigInteger fibonacci = BigInteger.ZERO;
        BigInteger fibonacci2 = BigInteger.ONE;

        for (int i = 1; i <= limit; i ++){System.out.print(fibonacci + ", ");
            fibonacci = fibonacci.add(fibonacci2);
            fibonacci2 = fibonacci.subtract(fibonacci2);}
    }
}
