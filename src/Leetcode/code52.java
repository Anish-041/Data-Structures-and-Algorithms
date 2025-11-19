package Leetcode;

import java.util.Arrays;

public class code52 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        System.out.println(Arrays.toString(productExceptSelf(arr)));
    }

    /// [1,2,3,4]
//    public static int[] productExceptSelf(int[] nums) {
//        int[] ans = new int[nums.length];
//        for (int i=0;i<nums.length;i++) {
//            ans[i] = prod(0, nums.length,nums,i);
//        }
//        return ans;
//    }

//    public static int prod(int start,int end,int[] arr,int k) {
//        int ans = 1;
//        for (int i=start;i<end;i++) {
//            if (i!=k) ans = ans*arr[i];
//        }
//        return ans;
//    }

//    public static int[] productExceptSelf(int[] arr) {
//        int[] res = new int[arr.length];
//        int[] lr = new int[arr.length];
//        int[] rl = new int[arr.length];
//        int prod = 1;
//
//        for (int i=0;i<arr.length;i++) {
//            prod*=arr[i];
//            lr[i] = prod;
//        }
//
//        prod =1;
//
//        for (int i=arr.length-1;i>=0;i--) {
//            prod*=arr[i];
//            rl[i] = prod;
//        }
//
//        for (int i=0;i<arr.length;i++) {
//            int ans = 1;
//            int left = 1;
//            if (i-1>=0) {
//                left = lr[i-1];
//            }
//            int right =1;
//            if (i+1<arr.length) {
//                right = rl[i+1];
//            }
//            ans = left*right;
//            res[i] = ans;
//        }
//        return res;
//    }

    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        // Step 1: Build prefix products
        result[0] = 1;
        for (int i = 1; i < n; i++) {
            result[i] = result[i - 1] * nums[i - 1];
        }

        // Step 2: Multiply with suffix products
        int suffix = 1;
        for (int i = n - 1; i >= 0; i--) {
            result[i] = result[i] * suffix;
            suffix *= nums[i];
        }

        return result;
    }
}
