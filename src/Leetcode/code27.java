package Leetcode;

public class code27 {
    public static void main(String[] args) {

    }

    public static String toLowerCase(String s) {
        StringBuilder str = new StringBuilder();
        char[] ch = s.toCharArray();
        for (int i=0;i<ch.length;i++) {
            int ascii = ch[i];
            if (ascii < 97 && ch[i]>='A' && ch[i]<='Z') {
                ascii = ascii + 32;
                ch[i] = (char)ascii;
            }
        }
        str.append(ch);
        return str.toString();
    }
}
