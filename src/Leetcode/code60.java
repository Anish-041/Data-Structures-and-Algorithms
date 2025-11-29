package Leetcode;

import java.util.Arrays;

public class code60 {
    public static void main(String[] args) {
//        int[] arr = {0,3,7,2,5,8,4,6,0,1};
//        int[] arr = {100,4,200,1,3,2};
        int[] arr = {9,1,4,7,3,-1,0,5,8,-1,6};
        System.out.println(longestConsecutive(arr));
    }

    public static int longestConsecutive(int[] nums) {
        if (nums.length==0) return 0;
        Arrays.sort(nums);

        int longest =1;
        int current =1;
        for (int i=1;i<nums.length;i++) {
            if (nums[i] == nums[i-1]) {
                continue;
            }
            if (nums[i] == nums[i-1] + 1) {
                current++;
            }
            else {
                longest = Math.max(longest,current);
                current=1;
            }
        }
        return Math.max(longest,current);
    }
}
