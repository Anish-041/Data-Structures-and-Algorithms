package Leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class code12 {
    public static void main(String[] args) {

    }

    //    public static List<Integer> addToArrayForm(int[] num, int k) {
//        List<Integer> list = new ArrayList<>();
//        StringBuilder n = new StringBuilder();
//        for (int i: num) {
//            n.append(i);
//        }
//        long number = Integer.parseUnsignedInt(n.toString());
//        long ans = number + k;
//        int l = (int)count(ans);
//        int[] arr = new int[l];
//        int i=0;
//        while (ans>0) {
//            long rem = ans % 10;
//            arr[i] = (int)rem;
//            ans=ans/10;
//            i++;
//        }
//        for (i=0;i<arr.length;i++) {
//            list.addFirst(arr[i]);
//        }
//        return list;
//    }

    public static long count(long n) {
        int count = 0;
        while (n>0) {
            long rem = n%10;
            if (rem>=0) count++;
            n=n/10;
        }
        return count;
    }

    public static List<Integer> addToArrayForm(int[] A, int K) {
        int N = A.length;
        int cur = K;
        List<Integer> ans = new ArrayList();

        int i = N;
        while (--i >= 0 || cur > 0) {
            if (i >= 0)
                cur += A[i];
            ans.add(cur % 10);
            cur /= 10;
        }

        Collections.reverse(ans);
        return ans;
    }
}
