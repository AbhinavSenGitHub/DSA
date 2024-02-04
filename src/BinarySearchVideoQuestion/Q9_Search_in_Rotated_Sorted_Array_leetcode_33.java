package BinarySearchVideoQuestion;

public class Q9_Search_in_Rotated_Sorted_Array_leetcode_33 {
    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2,3};
        int target = 6;
        int ans = search(nums, target);
        System.out.println(ans);
    }
    public static int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        while (start <= end){
            int mid = start + (end - start)/2;
            if (target == nums[mid]) {
                return mid;
            }
            if (nums[start] <= nums[mid]){
                if (target < nums[mid] && target >= nums[start]){
                    end = mid -1;
                }else{
                    start = mid + 1;
                }
            }
            if (nums[mid] <= nums[end]){
                if (target > nums[mid] && target <= nums[end]){
                    start = mid + 1;
                }else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}
