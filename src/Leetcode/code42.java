package Leetcode;

public class code42 {
    public static void main(String[] args) {
        String word = "abcdefd";
        char ch = 'k';
        System.out.println(reversePrefix(word,ch));
    }

    public static String reversePrefix(String word, char ch) {
        StringBuilder ans = new StringBuilder();
        int temp=0;
        for (int i=0;i<word.length();i++) {
            if (ch == word.charAt(i)) {
                temp = i;
                ans.append(reverseFromch(word,i));
                break;
            }
        }

        if (temp==0) {
            return word;
        }

        for (int i=temp+1;i<word.length();i++) {
            ans.append(word.charAt(i));
        }
        return ans.toString();
    }

    static String reverseFromch(String word , int i) {
        StringBuilder str = new StringBuilder();
        for(int k=i;k>=0;k--) {
            str.append(word.charAt(k));
        }
        return str.toString();
    }
}
