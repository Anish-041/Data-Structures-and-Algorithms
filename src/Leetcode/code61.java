package Leetcode;

import java.util.Arrays;

public class code61 {
    public static void main(String[] args) {
//        int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        rotate(arr);
    }

    public static void rotate(int[][] matrix) {
//        int row =matrix.length-1;
//        int col = 0;
//
//        StringBuilder str = new StringBuilder();
//        str.append("[");
//
//        while (col < matrix[0].length) {
//            str.append("[");
//            for (int i=row;i>=0;i--) {
//                str.append(matrix[i][col]);
//                if (i!=0) str.append(",");
//            }
//            str.append("]");
//            if (col != matrix[0].length-1) str.append(",");
//            col++;
//        }
//        str.append("]");
//        System.out.println(str.toString());
        int row = matrix.length;
        int col = matrix[0].length;

        for (int i=0;i<row;i++) {
            for(int j=i+1;j<col;j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        for (int i=0;i<row;i++) {
            int left = 0;
            int right = col-1;
            while (left<right) {
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;
                left++;
                right--;
            }
        }

        for (int i=0;i<row;i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
    }
}
