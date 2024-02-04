package Searching;

import java.util.Arrays;

public class SearchIn2D_Array {
    public static void main(String[] args) {
        int[][] arr ={
            {12,4,53},
            {67,5,49,67},
            {34,65,31,78,89},
            {1,6}
        };
        int target = 78;
        int[] ans = search(arr, target);
        System.out.println(arr.length);
        System.out.println("Ans:- " + Arrays.toString(ans));
    }
    static int[] search(int[][] arr, int target){
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (target == arr[row][col]) return new int[]{row, col};
            }
        }
        return new int[] {-1,-1};
    }
}
