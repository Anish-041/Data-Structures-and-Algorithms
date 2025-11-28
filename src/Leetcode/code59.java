package Leetcode;

import java.util.Arrays;
import java.util.Collections;

public class code59 {
    public static void main(String[] args) {
        int[] arr = {1,3,5,4,2};
        nextPermutation(arr);
    }

    public static void nextPermutation(int[] nums) {
         int n = nums.length;
         int i = -1;

         for (int k = n-2;k>=0;k--) {
             if (nums[k] < nums[k+1]) {
                 i=k;
                 break;
             }
         }

         if (i!=-1) {
             for (int j = n-1;j>=0;j--) {
                 if (nums[j] > nums[i]) {
                     swap(i,j,nums);
                     break;
                 }
             }
         }

         reverse(i+1,n-1,nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void swap(int i,int j,int[] nums) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void reverse(int i,int j,int[] nums) {
        while (i<j) {
            swap(i,j,nums);
            i++;
            j--;
        }
    }
}
