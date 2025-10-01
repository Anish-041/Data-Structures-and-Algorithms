package Leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class code15 {
    public static void main(String[] args) {

    }

    public static List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        List<Integer> maxlist = new ArrayList<>();
        List<Integer> minlist = new ArrayList<>();
        int row = 0;
        int col = 0;

        while (col < matrix[0].length) {
            int max = 0;
            for (int i = 0; i < matrix.length; i++) {
                if (matrix[i][col] > max) max = matrix[i][col];
            }
            maxlist.add(max);
            col++;
        }

        while (row < matrix.length) {
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < matrix[0].length; i++) {
                if (min > matrix[row][i]) min = matrix[row][i];
            }
            minlist.add(min);
            row++;
        }
        Collections.reverse(minlist);
        for (Integer integer : maxlist) {
            for (Integer value : minlist) {
                if (integer.equals(value)) {
                    list.add(integer);
                }
            }
        }
        return list;
    }
}
