package ArraysLeetcode;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Q8_howManyNumberSmallerThan_theCurrentNum {
    public static void main(String[] args) {
        int[]  arr = {8,1,2,2,3};
        int [] ans = smallerNumbersThanCurrent(arr);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int count = 0;
        int[] ans = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            for(int j= 0; j < nums.length; j++){
                if(nums[i] > nums[j] && i != j) {
                    System.out.println(i + " j:-  " + j);
                    count++;
                }
            }
            ans[i] = count;
            count = 0;
        }
        return ans;
    }
}
