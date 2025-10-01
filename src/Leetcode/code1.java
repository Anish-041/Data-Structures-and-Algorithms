package Leetcode;

public class code1 {
    public static void main(String[] args) {

    }

    public static int[] runningSum(int[] nums) {
        int sum = 0;
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
            ans[i] = sum;
        }
        return ans;
    }
}
