package Leetcode;

public class code30 {
    public static void main(String[] args) {
        String[] patterns = {"a","abc","bc","d"};
        String word = "abc";
//        String s1 = word.substring(1);
//        System.out.println(s1);
        System.out.println(numOfStrings(patterns,word));
    }

    public static int numOfStrings(String[] patterns, String word) {
        int count = 0;
        for (int i=0;i<patterns.length;i++) {
            if (word.contains(patterns[i])) {
                count++;
            }
        }
        return count;
    }
}
