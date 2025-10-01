package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class code7 {
    public static void main(String[] args) {

    }

    public static boolean checkIfPangram(String sentence) {
        String alpa = "abcdefghijklmnopqrstuvwxyz";
        List<Character> list = new ArrayList<>(sentence.length());
        List<Character> alphabet = new ArrayList<>();
        for (int i = 0; i < alpa.length(); i++) {
            alphabet.add(alpa.charAt(i));
        }
        for (int i = 0; i < sentence.length(); i++) {
            list.add(sentence.charAt(i));
        }
        if (list.containsAll(alphabet)) {
            return true;
        }
        return false;
    }
}
