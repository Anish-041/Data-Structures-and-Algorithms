package Leetcode;

public class code16 {
    public static void main(String[] args) {

    }

    public static int maxSubArray(int[] nums) {
//        int max = Integer.MIN_VALUE;
//        int sum=0;
//        for (int i=0;i<nums.length;i++) {
//            for (int j=i;j<nums.length;j++) {
//                sum=0;
//                for (int k=i;k<=j;k++) {
//                    sum+=nums[k];
//                }
//                max = Math.max(sum,max);
//            }
//        }
//        return max;
        int n = nums.length;
        int sum=0;
        int ans=Integer.MIN_VALUE;

        for (int i=0;i<n;i++) {
            if (sum+nums[i]>=0) {
                sum=sum+nums[i];
                ans=Math.max(sum,ans);
            }
            else {
                sum=0;
            }
            ans = Math.max(ans,nums[i]);
        }
        return ans;
    }
}
