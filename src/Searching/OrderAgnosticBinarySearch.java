package Searching;

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        int[] arrA = {-65,-43,-21,0,1,3,5,7,32,65,89};

        int[] arD = {98, 76, 54, 32, -9, -7, -5, -1, 0};
        int target = -21;
        int ans = orderAgnosticBS(arrA, target);
        System.out.println(ans);
    }

    static int orderAgnosticBS(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        boolean isAD = nums[start] < nums[end];
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == nums[mid]) return mid;
            if (isAD) {
                if (target < nums[mid]) {
                    end = mid - 1;
                } else if (target > nums[mid]) {
                    start = mid + 1;
                }
            } else {
                if (target > nums[mid])
                    end = mid - 1;
                else if(target < nums[mid])
                    start = mid + 1;
            }
        }
        return -1;
    }

}
