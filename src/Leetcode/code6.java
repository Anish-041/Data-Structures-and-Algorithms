package Leetcode;

import java.util.ArrayList;

public class code6 {
    public static void main(String[] args) {

    }

    public static int[] createTargetArray(int[] nums, int[] index) {
        int[] ans= new int[nums.length];
        ArrayList<Integer> list = new ArrayList<>();
        for (int i=0;i< nums.length;i++) {
            list.add(index[i],nums[i]);
        }

        for (int j=0;j<list.size();j++) {
            ans[j] = list.get(j);
        }
        return ans;
    }
}
