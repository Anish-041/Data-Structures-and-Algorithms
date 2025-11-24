package Leetcode;

import java.util.Arrays;

public class code55 {
    public static void main(String[] args) {
        int[] arr = {0,2,1};
        sortColors(arr);
    }

    public static  void sortColors(int[] nums) {
        for (int i=0;i<nums.length;i++) {
            for (int j=i+1;j<nums.length;j++) {
                if (nums[i]>nums[j]) {
                    swap(i,j,nums);
                }
            }
        }
        System.out.println(Arrays.toString(nums));
    }

    public static void swap(int a , int b, int[] arr) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
