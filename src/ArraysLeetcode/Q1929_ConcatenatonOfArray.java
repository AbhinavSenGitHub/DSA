package ArraysLeetcode;

import java.util.Arrays;

public class Q1929_ConcatenatonOfArray {
    public static void main(String[] args) {
        int[]  arr = {1,2,1};
        int[] answer = getConcatenation(arr);
        System.out.println(Arrays.toString(answer));
    }
    public static int[] getConcatenation(int[] nums) {
        int [] ans = new int[nums.length*2];
        for(int i = 0; i < nums.length; i++){
            ans[i] = ans[i + nums.length] = nums[i];
        }
        return ans;
    }
}
