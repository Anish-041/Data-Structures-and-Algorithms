package Leetcode;

public class code34 {
    public static void main(String[] args) {
        String haystack = "abc";
        String needle = "c";
        System.out.println(strStr(haystack,needle));
    }

    public static int strStr(String haystack, String needle) {
        int index = haystack.indexOf(needle);
        return index;
    }
}

