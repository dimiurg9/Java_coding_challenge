package mytools;

public class ternaryPractice {
    static int a = 55;
    public static boolean forBoolean(int num) {

        if (num > a) return true;
        else return false;

    }

    public static void main(String args[]) {
        int num = 15;

        System.out.println(forBoolean(num) ? num + " > than " + a : num + " < than " + a);
    }

}


//
//    public static void main(String[] arg){
//
//        int x = 30;
//        int y = 20;
//
//        System.out.println((x > y)? " x > y": " x < y" );
//    }
//
//}
