package Leetcode;

public class code25 {
    public static void main(String[] args) {

    }

    public static String sortSentence(String s) {
        String[] str = s.split(" ");
        String[] s1 = new String[str.length];
        int index=0;
        for (int i=0;i<str.length;i++) {
            index = num(str[i]);
            String s2 = str[i].replaceAll("\\d","");
            s1[index-1] = s2;
        }
        return String.join(" ",s1);
    }

    static int num(String str) {
        char s1 = str.charAt(str.length()-1);
        int n = Character.getNumericValue(s1);
        return n;
    }
}
