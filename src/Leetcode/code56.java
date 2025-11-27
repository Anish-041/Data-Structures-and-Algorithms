package Leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class code56 {
    public static void main(String[] args) {
        int[] arr = {2,2,1,1,1,2,2};
        System.out.println(majorityElement(arr));
    }

    public static int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int major = n/2;
        int count = 1;
        int ans = 0;
        Map<Integer,Integer> map = new HashMap<>();
        for (int i=0;i<nums.length;i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i],count);
            }
            if (!map.containsKey(nums[i])) {
                count = 1;
                map.put(nums[i],count);
            }
            count++;
        }

        for (Map.Entry<Integer,Integer> entry : map.entrySet()) {
            if (entry.getValue()>major) {
                ans = entry.getKey();
                break;
            }
        }
        return ans;
    }
}
