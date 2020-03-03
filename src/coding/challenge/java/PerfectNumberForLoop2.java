package coding.challenge.java;

public class PerfectNumberForLoop2 {
    static int limit = 10000;
    public static boolean isPerfect(int num){
        int temp = 0;
        for (int i = 1; i <=num / 2; i++){if (num % i == 0){temp += i;}}
        if (temp == num) return true; else return false;
    }
    public static void main(String[] cla){
        long start = System.currentTimeMillis();
        for(int i = 1; i <= limit; i++){
            if (isPerfect(i)){System.out.print(i + ", ");}
        }
        long finish = System.currentTimeMillis();
        System.out.println("\n" + "response time: "  + (finish - start) + " ms");
    }
}
