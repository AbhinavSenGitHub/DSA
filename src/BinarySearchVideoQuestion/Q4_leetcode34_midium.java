package BinarySearchVideoQuestion;

import java.util.Arrays;

public class Q4_leetcode34_midium {
    public static void main(String[] args) {
        int[] nums = {5,7,7,7,1};
        int target = 7;
        int[] answer = searchRange(nums, target);
        System.out.println(Arrays.toString(answer));
    }
    public static int[] searchRange(int[] nums, int target) {
        int[] ans = {-1,-1};
        ans[0] = fistIndex(nums, target);
        if(ans[0] != -1){
            ans[1] = lastIndex(nums, target);
        }

        return ans;
    }
    static int fistIndex(int [] nums, int target){
        int start = 0;
        int end = nums.length-1;
        int idx = -1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(nums[mid] >= target){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
            if (nums[mid] == target){
                idx = mid;
            }
        }
        return idx;
    }

    static int lastIndex(int [] nums, int target){
        int start = 0;
        int end = nums.length-1;
        int idx = -1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(nums[mid] <= target){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
            if (nums[mid] == target){
                idx = mid;
            }
        }
        return idx;
    }
}
