package BinarySearchVideoQuestion;

public class Q8_leetcodeHeard_1095 {
    public static void main(String[] args) {
        int[] nums = {0,2,4,2,1};
        int target = 1;
        int ans = findInMountainArray(target, nums);
        System.out.println(ans);
    }

    public static int findInMountainArray(int target, int[] nums){
        int peak = peakValue(nums);
        int min = orderAgnosticBS(nums, target, 0, peak);
        if (min != -1){
            return min;
        }
        return orderAgnosticBS(nums,target,peak, nums.length-1);
    }
    static int peakValue(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while (start < end){
            int mid = start + (end - start)/2;
            if (arr[mid] < arr[mid + 1]){
                start = mid + 1;
            }else{
                end = mid;
            }
        }
        return start;
    }
    static int orderAgnosticBS(int[] arr, int target, int start, int end) {
        boolean isAD = arr[start] < arr[end];


        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == arr[mid]) return mid;
            if (isAD) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else if (target > arr[mid]) {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid])
                    end = mid - 1;
                else if(target < arr[mid])
                    start = mid + 1;
            }
        }
        return -1;
    }
}
