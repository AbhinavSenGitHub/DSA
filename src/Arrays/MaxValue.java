package Arrays;

public class MaxValue {
    public static void main(String[] args) {
        int[] arr ={1,99,0,13,18,3,5};
        System.out.println(max(arr,2,4));
    }
    static int max(int[] arr, int start, int end){
        if (start > end) return -1;

        if (arr.length== 0) return -1;

        int max = arr[0];
        for (int i = start; i <= end; i++) {
            if(max < arr[i]){
                max = arr[i];
            }
        }
        return max;
    }
}
