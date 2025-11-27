package Leetcode;

public class code16 {
    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(arr));
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
//        int n = nums.length;
//        int sum=0;
//        int ans=Integer.MIN_VALUE;
//
//        for (int i=0;i<n;i++) {
//            if (sum+nums[i]>=0) {
//                sum=sum+nums[i];
//                ans=Math.max(sum,ans);
//            }
//            else {
//                sum=0;
//            }
//            ans = Math.max(ans,nums[i]);
//        }
//        return ans;

        /// Approach 2
        int currsum = nums[0];
        int maxsum = nums[0];

        for (int i=1;i<nums.length;i++) {
            currsum = Math.max(nums[i],currsum + nums[i]);
            maxsum = Math.max(maxsum,currsum);
        }
        return maxsum;

    }
}
