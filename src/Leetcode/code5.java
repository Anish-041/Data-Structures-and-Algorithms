package Leetcode;

public class code5 {
    public static void main(String[] args) {

    }

    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i=0;i<nums.length;i++) {
            int cnt = 0;
            for (int j=0;j<nums.length;j++) {
                if (nums[j]<nums[i]) cnt++;
            }
            ans[i]=cnt;
        }
        return ans;
    }
}
