package Leetcode;

public class code40 {
    public static void main(String[] args) {
        String s ="1100";
        System.out.println(checkOnesSegment(s));
    }

    public static boolean checkOnesSegment(String s) {
        if (s.length()==1 && s.charAt(0)=='1') {
            return true;
        }
        char c = s.charAt(0);
        for (int i=1;i<s.length();) {
            if (c==s.charAt(i)) {
                i++;
            }
            else if (c!=s.charAt(i)) {
                c=s.charAt(i);
                return check(i,c,s);
            }
        }
        return true;
    }

    static boolean check(int i,char c,String s) {
        for (int k=i;k<s.length();k++)  {
            if (s.charAt(k)!=c) {
                return false;
            }
        }
        return true;
    }
}
