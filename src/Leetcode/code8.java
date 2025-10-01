package Leetcode;

import java.util.List;

public class code8 {
    public static void main(String[] args) {

    }

    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        for (List<String> arr : items)
            if (ruleKey.equals("type") && arr.get(0).equals(ruleValue))
                count++;
            else if (ruleKey.equals("color") && arr.get(1).equals(ruleValue))
                count++;
            else if (ruleKey.equals("name") && arr.get(2).equals(ruleValue))
                count++;
        return count;
    }
}
