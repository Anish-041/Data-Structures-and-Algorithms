package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class code68 {
    public static void main(String[] args) {
        int[] arr = {-1,0,1,2,-1,-4};
//        int[] arr = {0,0,0,0};
        List<List<Integer>> res = threeSum(arr);
        System.out.println(res);
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {
                    res.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    left++;
                    right--;

                    // skip duplicate left
                    while (left < right && nums[left] == nums[left - 1]) left++;

                    // skip duplicate right
                    while (left < right && nums[right] == nums[right + 1]) right--;
                }
                else if (sum < 0) {
                    left++;
                }
                else {
                    right--;
                }
            }
        }
        return res;
    }

/// TLE solution
//    public static List<List<Integer>> threeSum(int[] nums) {
//        List<List<Integer>> res = getLists(nums);
//        List<List<Integer>> unique = new ArrayList<>();
//        for (List<Integer> list : res) {
//            Collections.sort(list);
//            if (!unique.contains(list)) {
//                unique.add(list);
//            }
//        }
//        return unique;
//    }
//
//    private static List<List<Integer>> getLists(int[] nums) {
//        List<List<Integer>> res = new ArrayList<>();
//        for (int i = 0; i< nums.length; i++) {
//            for (int j = i+1; j< nums.length; j++) {
//                for (int k = j+1; k< nums.length; k++) {
//                    if (nums[i]+ nums[j]+ nums[k]==0 && i!=j && i!=k && j!=k) {
//                        List<Integer> list = new ArrayList<>();
//                        list.add(nums[i]);
//                        list.add(nums[j]);
//                        list.add(nums[k]);
//                        res.add(list);
//                    }
//                }
//            }
//        }
//        return res;
//    }
}
