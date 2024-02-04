package Searching;

public class Q1295_evenN0_ofDigits {
    public static void main(String[] args) {
        int[] arr= {123,23,5,-5667,87};
//        System.out.println(num(arr));
    }
//    static int num(int[] arr){
//        int digit = 0;
//        for (int num: arr) {
//            if (totalNumber(num)) digit++;
//        }
//        return digit;
//    }

//
    static int totalNumber(int n){
        if (n < 0){
            n = n * -1;
        }
        return (int)(Math.log10(n)) + 1;            //this formula is for total number of digits so remember it....!
    }

//    static boolean even(int n) {     //replaced by above logic  :)  !
//        int count = 0;
//        while (n > 0) {
//            n = n / 10;
//            count++;
//        }
//        return count % 2 == 0;
//    }
}
