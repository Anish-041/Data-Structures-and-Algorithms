package Leetcode;

public class code2 {
    public static void main(String[] args) {

    }

    public static int[] shuffle(int[] nums, int n) {
        int[] ans = new int[2*n];
        int index = 0;

        for (int i=0;i< n;i++) {
            ans[index++] = nums[i];
            ans[index++] = nums[i+n];
        }
        return ans;
    }
}
