package Leetcode;

import java.util.Arrays;

public class code58 {
    public static void main(String[] args) {
        int[] arr = {3,1,-2,-5,2,-4};
        System.out.println(Arrays.toString(rearrangeArray(arr)));
    }

    public static int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int[] pos = new int[n/2];
        int[] neg = new int[n/2];
        int posIndex=0;
        int negIndex=0;
        for (int i=0;i<n;i++) {
            if (nums[i] > 0) {
                pos[posIndex++] = nums[i];
            } else if (nums[i] < 0) {
                neg[negIndex++] = nums[i];
            }
        }
        int ansIndex = 0;
        int i=0;
        int j=0;
        while (i < pos.length && j < neg.length) {
            ans[ansIndex++] = pos[i];
            ans[ansIndex++] = neg[j];
            i++;
            j++;
        }
        return ans;
    }
}
