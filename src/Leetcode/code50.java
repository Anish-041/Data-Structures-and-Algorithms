package Leetcode;

import java.util.Arrays;

public class code50 {
    public static void main(String[] args) {
        int[] arr= {3,24,50,79,88,150,345};
        int target = 200;
        System.out.println(Arrays.toString(twoSum(arr,target)));
    }

    public static int[] twoSum(int[] numbers, int target) {
        int start = 0;
        int end = numbers.length-1;

        while (start<=end) {
            int sum = numbers[start]+ numbers[end];

            if (sum == target) {
                return new int[]{start+1,end+1};
            }
            else if (sum < target) {
                start++;
            }
            else {
                end--;
            }
        }
        return new int[]{-1,-1};
    }
}
