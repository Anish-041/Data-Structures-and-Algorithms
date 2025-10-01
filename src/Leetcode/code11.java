package Leetcode;

public class code11 {
    public static void main(String[] args) {

    }

    public static int[][] transpose(int[][] matrix) {
        int[][] ans = new int[matrix.length][matrix.length];
        for (int i=0;i<matrix.length;i++) {
            for (int j=0;j<matrix[0].length;j++) {
                ans[i][j] = matrix[j][i];
            }
        }
        return ans;
    }
}
