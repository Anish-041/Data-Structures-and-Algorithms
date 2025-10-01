package Leetcode;

public class code21 {
    public static void main(String[] args) {

    }

    public static int[][] generateMatrix(int n) {
        int[][] ans = new int[n][n];
        int[] arr = new int[n*n];
        for (int i=0;i<arr.length;i++) {
            arr[i] = i+1;
        }
//        System.out.println(Arrays.toString(arr));
        int top = 0 , bottom = n-1; // row
        int left = 0 , right = n-1; // col
        int index=0;
        while (top<=bottom && left<=right) {
            for (int i=left;i<=right;i++) {
                ans[top][i] = arr[index++];
            }
            top++;

            for (int i=top;i<=bottom;i++) {
                ans[i][right] = arr[index++];
            }
            right--;

            if (top<=bottom) {
                for (int i=right;i>=left;i--) {
                    ans[bottom][i] = arr[index++];
                }
                bottom--;
            }
            if (left<=right) {
                for (int i=bottom;i>=top;i--) {
                    ans[i][left] = arr[index++];
                }
                left++;
            }
        }
        return ans;
    }
}
