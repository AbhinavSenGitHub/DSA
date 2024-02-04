package BinarySearchVideoQuestion;
//https://leetcode.com/problems/peak-index-in-a-mountain-array/submissions/850498224/
public class Q6_MountainArray {
    public static void main(String[] args) {
        int[] arr= {3,1};
        int ans = peakIndexInMountainArray(arr);
        System.out.println(ans);
    }
    public static int peakIndexInMountainArray(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start < end){
            int mid = start + (end - start)/2;
            if (arr[mid] < arr[mid + 1]){
                start = mid + 1;
            }else{
                end = mid;
            }
        }
        return start;
    }
}
