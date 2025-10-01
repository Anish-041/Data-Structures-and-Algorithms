package Leetcode;

public class code23 {
    public static void main(String[] args) {

    }

    public static String restoreString(String s, int[] indices) {
        StringBuilder ans  = new StringBuilder();
        char[] ch = s.toCharArray();
        for (int i=0;i<indices.length;i++) {
            ch[indices[i]] = s.charAt(i);
        }
        ans.append(ch);
        return ans.toString();
    }
}
