package Leetcode;

public class code54 {
    public static void main(String[] args) {
        int[] arr = {-1,-1,1};
        System.out.println(longestSubarray(arr,0));
    }

    public static int longestSubarray(int[] nums, int k) {
        int count = 0;

        for (int i=0;i<nums.length;i++) {
            int sum = 0;

            for (int j=i;j<nums.length;j++) {
                sum = sum + nums[j];
                if (sum==k) {
                    count++;
                }
            }
        }
        return count;
    }
}
