package BinarySearchVideoQuestion;

public class Q1_CeilingOf_a_Number {
    public static void main(String[] args) {
        int[]  arr = {2,3,5,9,14,16,18};
        System.out.println(ceilingNumber(arr,14));
    }
    static int ceilingNumber(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        boolean isAD = arr[start] < arr[end];

        while (start <= end) {

            int mid = start + (end - start) / 2;
            if (target == arr[mid]) return arr[mid];
            if (isAD) {
                if (target > arr[arr.length-1]) return -1;
                if (target < arr[mid]) {
                    end = mid - 1;
                } else if (target > arr[mid]) {
                    start = mid + 1;
                }
            } else {
                if (target > arr[0]) return -1;
                if (target > arr[mid])
                    end = mid - 1;
                else if(target < arr[mid])
                    start = mid + 1;
            }
        }
        if (isAD) return arr[start];
        else return arr[end];
    }
}
