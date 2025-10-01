package Leetcode;

public class code24 {
    public static void main(String[] args) {

    }

    public static String interpret(String command) {
        StringBuilder str = new StringBuilder();
//        int l = command.length();
        char[] ch = command.toCharArray();
        for (int i=0;i<ch.length;i++) {
            if (ch[i] == 'G') {
                str.append("G");
            }
            if (ch[i] == '(' && ch[i+1] == ')') {
                str.append("o");
            }
            if (ch[i] == '(' && ch[i+1] == 'a') {
                str.append("al");
            }
        }
        return str.toString();
    }
}
