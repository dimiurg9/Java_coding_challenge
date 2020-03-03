package coding.challenge.java;

public class PrimeNumber {
    public static boolean isPrime(int number){
        if (number < 2) return false;
        if (number == 2) return true;
        for (int i = 2; i < number; i++){
            if (number % i == 0) return false;
        }
        return true;
    }
public static void main(String[] cla){
        int limit = 75;
        for (int number = 1; number <= limit; number ++){
            if (isPrime(number)) {System.out.print(number + ", ");}
        }
}
}
