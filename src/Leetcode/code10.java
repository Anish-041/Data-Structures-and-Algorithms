package Leetcode;

public class code10 {
    public static void main(String[] args) {

    }


    public static int diagonalSum(int[][] mat) {
        int row=mat.length;
        int col=mat[0].length;
        int sum=0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(i==j || i+j==row-1){
                    sum+=mat[i][j];
                }
            }
        }
        return sum;
    }
}
