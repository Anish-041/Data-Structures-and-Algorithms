package Leetcode;

public class code28 {
    public static void main(String[] args) {
        String s = "textbook";
        System.out.println(halvesAreAlike(s));
    }

    public static boolean halvesAreAlike(String s) {
        int mid = s.length()/2;
        int cnt1 = 0;
        int cnt2 = 0;
        for (int i=0;i<mid;i++) {
            if (s.charAt(i)== 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u' ||
                    s.charAt(i)== 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'I' || s.charAt(i) == 'O' || s.charAt(i) == 'U') cnt1++;
        }

        for (int i=mid;i<s.length();i++) {
            if (s.charAt(i)== 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u' ||
                    s.charAt(i)== 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'I' || s.charAt(i) == 'O' || s.charAt(i) == 'U') cnt2++;
        }

        if (cnt1==cnt2) return true;
        return false;
    }
}
