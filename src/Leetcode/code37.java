package Leetcode;

public class code37 {
    public static void main(String[] args) {
        String s ="pidbliassaqozokmtgahluruufwbjdtayuhbxwoicviygilgzduudzgligyviciowxbhuyatdjbwfuurulhagtmkozoqassailbdip";
        System.out.println(validPalindrome(s));
    }

    public static boolean validPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right))
                return check(left, right - 1, s) || check(left + 1, right, s);
            left++;
            right--;
        }
        return true;
    }

    public static boolean check(int left, int right, String s) {
        while (left < right) {
            if (s.charAt(left) != s.charAt(right))
                return false;
            left++;
            right--;
        }
        return true;
    }
}
