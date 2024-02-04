package Searching;

public class Max_In_2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {12, 0, 54},
                {13, 43},
                {14, 43, 65, 2, 8, 97, 6},
                {16, 40, 76, 545}
        };
        System.out.println(max(arr));
    }
    static int max(int[][] arr){
        if (arr.length == 0) return -1;
        int max = Integer.MIN_VALUE;     // or    arr[0][0];
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (max < arr[row][col])
                    max = arr[row][col];
            }
        }
        return max;
    }
}
