package ArraysLeetcode;

import java.util.Arrays;

public class Q1480_Running_Sum {
    public static void main(String[] args) {
        int[]  arr = {1,2,1};
        int[] answer = runningSum(arr);
        System.out.println(Arrays.toString(answer));
    }
    public static int[] runningSum(int[] nums) {

        for (int j = 1; j < nums.length; j++) {
            nums[j] = nums[j] + nums[j-1];
        }
        return nums;
    }
}
