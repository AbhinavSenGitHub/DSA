package Recursion;

public class Q1_Num1to5 {
    public static void main(String[] args) {
        numReverse(5);
        number(1);

    }
    static void numReverse(int n){
        if (n==0) return;

        numReverse(n-1);
        System.out.println(n);
    }

    static void number(int n){
        if(n==5) {
//            System.out.println(n);
            return;
        }
//        System.out.println(n);
        number(n+1);
        System.out.println(n);
    }
}
