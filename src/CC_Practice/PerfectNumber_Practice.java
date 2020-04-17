package CC_Practice;
// 4/16/20
//within created class:
//1. declare a variable limit, assign it to 10000
//2. create boolean method "isPerfect" which takes int as an argument give name "num"
//3. declare variable temp, assign it to 0;
//4. create for loop (starting from 1; less or equal to half of num ; iteration)
//5. continue for loop with if delimiter == 0 temp += i
//6. compare temp and num, return true if it equal
//7. else > false
//8. create main method
//9. start timing
//10.iterate started from 1 to limit add if statement
//taking result from above method taking arg f.e i from main method
//11. print i + " , "
//12. finish timing
//13. print timing result

public class PerfectNumber_Practice {
    static int limit = 10000;

    public static boolean isPerfect(int num) {
        int temp = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                temp += i;
            }
        }
        if (temp == num) return true;
        else return false;
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        for (int i = 1; i <= limit; i++)
            if (isPerfect(i)) {
                System.out.print(i + " ,");
            }
        long finish = System.currentTimeMillis();
        System.out.print("\n" + "response time: " + (finish - start) + " ms");
    }
}

