package Leetcode;

public class code26 {
    public static void main(String[] args) {

    }

    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        boolean ans = false;
        String str1 = String.join("",word1);
        String str2 = String.join("",word2);

        if (str1.equals(str2)) {
            ans = true;
        }
        return ans;
    }
}
