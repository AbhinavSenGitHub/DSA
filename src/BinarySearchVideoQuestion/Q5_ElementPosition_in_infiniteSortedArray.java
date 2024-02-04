package BinarySearchVideoQuestion;

public class Q5_ElementPosition_in_infiniteSortedArray {
    public static void main(String[] args) {
        int[] arr = {2,4,6,7,9,13,15,17,25,40};
        int target = 40;
        System.out.println(check(arr, target));
    }
//    to get the set
    static int check(int[] arr, int target){
        int start =0;
        int end = 1;
        while(target > arr[end]){
            int newStart = end + 1;
            end =end + (end - start + 1)*2;
            if (end > arr.length-1){
                end = arr.length-1;
            }
            start = newStart;
        }
        return search(arr,target,start,end);
    }

//    simple binary search
    static int search(int[] arr ,int target, int start, int end){
        while(start <= end){
            int mid = start + (end - start)/2;
            if (target < arr[mid]){
                end = mid - 1;
            }else if (target > arr[mid]){
                start = mid + 1;
            }else{
                return mid;
            }

        }
     return -1;
    }
}
