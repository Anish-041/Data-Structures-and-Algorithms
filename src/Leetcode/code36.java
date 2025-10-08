package Leetcode;

public class code36 {
    public static void main(String[] args) {
        String str = "0P";
        System.out.println(isPalindrome(str));
    }

    public static boolean isPalindrome(String s) {
        String str = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        int i=0;
        int j=str.length()-1;

        while (i<=j) {
            if (str.charAt(i)==str.charAt(j)) {
                i++;
                j--;
            }
            else return false;
        }
        return true;
    }
}
