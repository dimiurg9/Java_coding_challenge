package coding.challenge.java;

public class PerfectNumberBetween {
    static int limit = 33550336;

    public static boolean isPerfectNumber(int number) {
        int temp = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                temp += i;
            }
        }
        if (temp == number) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] cla) {
        final long start = System.nanoTime();
        for (int i = 33500336; i <= limit; i++) {
            if (isPerfectNumber(i)) {
                System.out.println(i);
            }
        }
        final long finish = System.nanoTime();
        System.out.println((finish - start) + " nanoseconds");
        System.out.println((finish - start) / 1000000000.0 + " seconds; ");
        System.out.println((finish - start) / 60000000000.0 + " minutes");}
    }

