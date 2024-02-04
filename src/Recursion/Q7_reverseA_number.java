package Recursion;

import org.w3c.dom.ls.LSOutput;

public class Q7_reverseA_number {
    public static void main(String[] args) {
        reverse(1000);
    }
    static void reverse(int n){
        if (n == 0)
            return;
        System.out.print(n%10);
        reverse(n/10);
    }
}
