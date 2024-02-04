package BinarySearchVideoQuestion;

public class Q2_floorNumber {
    public static void main(String[] args) {
        int[]  arr = {18,16,14,9,5,2};
        System.out.println(floor(arr,2));
    }
    static int floor(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        boolean isAD = arr[start] < arr[end];
        while (start <= end) {
            int mid = start + (end - start)/2;
            if (target == arr[mid]) return arr[mid];
            if (isAD) {
                if (target < arr[0]) return -1;
                if (target < arr[mid]) {
                    end = mid - 1;
                } else if (target > arr[mid]) {
                    start = mid + 1;
                }
            } else {
                if (target < arr[arr.length-1]) return -1;
                if (target > arr[mid])
                    end = mid - 1;
                else if (target < arr[mid])
                    start = mid + 1;
            }
        }
        if (isAD) return arr[end];
        else return arr[start];
    }
}
