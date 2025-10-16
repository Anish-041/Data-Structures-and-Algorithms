package Leetcode;

public class code44 {
    public static void main(String[] args) {
        String s = "luffy is still joyboy";
        System.out.println(lengthOfLastWord(s));
    }

    public static int lengthOfLastWord(String s) {
        String[] str = s.split(" ");
        int l = str.length;
        return str[l-1].length();
    }
}
