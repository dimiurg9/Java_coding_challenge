package coding.challenge.java;

    public class PrimeNumbers2 {
        public static boolean isPrime(int number){
            if (number < 2) return false;
            if (number == 2) return true;
            if (number % 2 == 0) return false;
            for (int i = 3; i < Math.sqrt(number); i++){
                if (number % i == 0) return false;
            }
            return true;
        }
    public static void main(String[] cla){
            int limit = 100;
            for (int number = 1; number <= limit; number ++){
                if (isPrime(number)){System.out.print(number + ", ");}
            }
    }
}
