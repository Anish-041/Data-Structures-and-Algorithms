package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class code3 {
    public static void main(String[] args) {

    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> ans = new ArrayList<>();

        int max = 0;
        for (int i : candies) {
            if (i > max) max = i;
        }

        int c=0;
        for (int i=0;i<candies.length;i++) {
            c = candies[i] + extraCandies;
            ans.add(c>=max);
        }
        return ans;
    }
}
