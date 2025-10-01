package Leetcode;

public class code22 {
    public static void main(String[] args) {

    }

    public static String defangIPaddr(String address) {
        StringBuilder ans = new StringBuilder();
        char[] ch = address.toCharArray();
        for (int i=0;i<ch.length;i++) {
            if (ch[i] == '.') {
                ans.append("[.]");
            }
            else ans.append(ch[i]);
        }
        return ans.toString();
    }
}
