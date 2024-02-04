package Searching;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {-65,-43,-21,0,1,3,5,7,32,65,89};
//        int[] arr = {98,76,54,32,-9,-7,-5,-1,0};
        int target = 76;
        System.out.println(search(arr, target));
    }
    static int search(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        while (start <= end){
            int mid = start + (end - start)/2;
            if (target < arr[mid])
                end = mid - 1;
            else if(target > arr[mid])
                start = mid + 1;
            else
                return mid;
        }
        return -1;
    }
}
