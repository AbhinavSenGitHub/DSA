package ArraysLeetcode;

import java.util.Arrays;

public class Q1470_Shuffle_the_Array {
    public static void main(String[] args) {
        int[]  arr = {1,2,1, 5,6,7};
        int n = arr.length/2;
        int[] answer = shuffle(arr,n);
        System.out.println(Arrays.toString(answer));
    }
    static int[] shuffle(int[] nums, int n){
        int[] ans = new int[2*n];
        for (int i = 0; i < n; i++) {
            ans[i*2] = nums[i];
            ans[i*2+1] = nums[i+n];
        }
        return ans;
    }
}
