package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class code63 {
    public static void main(String[] args) {
        int[] arr = {1,2};
        List<Integer> res = majorityElement(arr);
        System.out.println(res);
    }

    public static List<Integer> majorityElement(int[] nums) {
        int cand1 = 0;
        int cand2 = 0;
        int cnt1 = 0;
        int cnt2 = 0;

        for (int num: nums) {
            if (num == cand1) {
                cnt1++;
            }
            else if (num == cand2) {
                cnt2++;
            }
            else if (cnt1==0) {
                cand1 = num;
                cnt1 = 1;
            }
            else if (cnt2 == 0) {
                cand2 = num;
                cnt2 = 1;
            }
            else {
                cnt1--;
                cnt2--;
            }
        }

        cnt1 = 0;
        cnt2 = 0;

        for (int num : nums) {
            if (cand1 == num) cnt1++;
            else if (cand2 == num) cnt2++;
        }

        List<Integer> list = new ArrayList<>();
        int limit = nums.length/3;
        if (cnt1 > limit) list.add(cand1);
        if (cnt2 > limit) list.add(cand2);

        return list;
    }
}
