package Leetcode;

public class code39 {
    public static void main(String[] args) {
        String sequence = "aaabaaaabaaabaaaabaaaabaaaabaaaaba";
//        System.out.println(sequence.length());
        String word = "aaaba";
        System.out.println(maxRepeating(sequence,word));
    }

    public static int maxRepeating(String sequence, String word) {
        int k = 0;
        String str = word;
        while (sequence.contains(str)) {
            k++;
            str+=word;
        }
        return k;
    }
}
