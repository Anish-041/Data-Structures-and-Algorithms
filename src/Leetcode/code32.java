package Leetcode;

import java.util.Arrays;

public class code32 {
    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        System.out.println(reverseWords(s));
    }

    public static String reverseWords(String s) {
        StringBuilder str = new StringBuilder();
        String[] s1 = s.split(" ");
        for (int i=0;i<s1.length;i++) {
            for (int j=s1[i].length()-1;j>=0;j--) {
                str.append(s1[i].charAt(j));
            }
            if (i==s1.length-1) break;
            str.append(" ");
        }
        return str.toString();
    }
}
