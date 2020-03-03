package coding.challenge.java;

public class PerfectNumbers {
    static int limit = 10000;
    public static boolean isPerfect(int num){
        int temp = 0;
        for (int i = 1; i <= num / 2; i++){if (num % i == 0){temp +=i;}}
        if (temp == num) return true; else return false;

    }
    public static void main(String[] cla){
        for (int i = 1; i <=limit; i ++){
            if (isPerfect(i)){System.out.print(i + ", ");}
        }
    }
}
