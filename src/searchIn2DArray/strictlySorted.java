package searchIn2DArray;

import java.util.Arrays;

public class strictlySorted {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2,3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        System.out.println(Arrays.toString(search(matrix, 0)));
    }

//    search in the row
    static int[] binarySearch(int[][] matrix, int row, int cStart, int cEnd, int target) {
        while (cStart <= cEnd) {
            int mid = cStart + (cEnd - cStart) / 2;
            if (matrix[row][mid] == target){
                return new int[]{row, mid};
            }
            if (matrix[row][mid] < target){
                cStart = mid + 1;
            }else{
                cEnd = mid - 1;
            }
        }
        return new int[]{-1,-1};
    }

    static int[] search(int[][] matrix, int target){
        int rows = matrix.length;        // number of rows
        int cols = matrix[0].length;      // col length

        if (rows == 1){
            return binarySearch(matrix, 0, 0, cols-1, target);
        }

        int rStart = 0;
        int rEnd = rows - 1;
        int cMid = cols/2;
        while(rStart < (rEnd - 1)){
            int rMid = rStart + (rEnd - rStart) / 2;
            if (matrix[rMid][cMid] == target){
                return new int[] {rMid, cMid};
            }
            if (matrix[rMid][cMid] < target){
                rStart = rMid;
            }else{
                rEnd = rMid;
            }
        }

//        now we have only two rows
//        check whether target lies in the upper and lower cols
        if (matrix[rStart][cMid] == target){
            return new int[]{rStart, cMid};
        }
        if (matrix[rEnd][cMid] == target){
            return new int[]{rEnd, cMid};
        }

//        check in 1st half
        if (target <= matrix[rStart][cMid-1]){
            return binarySearch(matrix, rStart, 0, cMid - 1, target);
        }
//        check in 2nd half
        if (target >= matrix[rStart][cMid+1] && target <= matrix[rStart][cols - 1]){
            return binarySearch(matrix, rStart, cMid+1, cols - 1, target);
        }
//        check in 3td half
        if (target <= matrix[rStart+1][cMid-1]){
            return binarySearch(matrix,rStart+1, 0, cMid-1, target);
        }else{
//        check in 4th half
            return binarySearch(matrix, rStart+1, cMid+1, cols - 1, target);
        }

    }

}
