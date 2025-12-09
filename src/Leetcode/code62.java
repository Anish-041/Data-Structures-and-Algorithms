package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class code62 {
    public static void main(String[] args) {
        int n = 5;
        List<List<Integer>> ans = generate(n);
        System.out.println(ans);
    }

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        int i=1;
        int val = 1;
        while (i<=numRows) {
            List<Integer> list = new ArrayList<>();
            int[] arr = new int[i];
            if (i==1) {
                list.add(val);
                arr[0] = val;
            }
            else {
                List<Integer> temp = ans.get(i-2);
                arr[0] = 1;
                arr[i-1] = 1;
                for (int k=1;k<i-1;k++ ) {
                    arr[k] = temp.get(k-1) + temp.get(k);
                }

                for (int x: arr) {
                    list.add(x);
                }
            }
            ans.add(list);
            i++;
        }
        return ans;
    }
}
