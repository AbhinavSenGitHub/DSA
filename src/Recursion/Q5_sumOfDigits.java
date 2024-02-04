package Recursion;

public class Q5_sumOfDigits {
    public static void main(String[] args) {
        int ans = digit(1234);
        System.out.println(ans);
    }
    static int digit(int n){
        if (n == 0) return 0;
        return n%10 + digit(n/10);
    }
}
