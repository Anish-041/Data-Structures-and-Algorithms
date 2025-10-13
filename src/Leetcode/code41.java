package Leetcode;

public class code41 {
    public static void main(String[] args) {
        String word1 = "ab";
        String word2 = "p";
        System.out.println(mergeAlternately(word1,word2));
    }

    public static String mergeAlternately(String word1, String word2) {
        StringBuilder ans = new StringBuilder();

        int i=0;
        int j=0;

        while (i<word1.length() && j<word2.length()) {
            if (i==word1.length()-1) {
                ans.append(word1.charAt(i));
                return ans.append(remainingString(word2,j)).toString();
            } else if (j==word2.length()-1) {
                ans.append(word1.charAt(i));
                ans.append(word2.charAt(j));
                return ans.append(remainingString(word1,i+1)).toString();
            }
            ans.append(word1.charAt(i));
            ans.append(word2.charAt(j));
            i++;
            j++;
        }
        return ans.toString();
    }

    static String remainingString(String s,int i) {
        StringBuilder str = new StringBuilder();
        for (int k=i;k<s.length();k++) {
            str.append(s.charAt(k));
        }
        return str.toString();
    }
}
