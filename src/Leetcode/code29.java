package Leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class code29 {
    public static void main(String[] args) {
        String str = "10#11#12";
        System.out.println(freqAlphabets(str));
    }

    public static String freqAlphabets(String s) {
        StringBuilder ans = new StringBuilder();
        String str = "abcdefghijklmnopqrstuvwxyz";
        HashMap<Integer,Character> map = new HashMap<>();
        for (int i=1;i<=9;i++) {
            map.put(i,str.charAt(i-1));
        }

        for (int i=10;i<=26;i++) {
            map.put(i,str.charAt(i-1));
        }

        int[] arr = getArray(s);

        for (int i=0;i<arr.length;i++) {
            if (map.containsKey(arr[i])) {
                ans.append(map.get(arr[i]));
            }
        }
//        System.out.println(map);
        return ans.toString();
    }

    static int[] getArray(String s) {
        List<Integer> list = new ArrayList<>();

        for (int i=0;i<s.length();) {
            if (i+2 < s.length() && s.charAt(i+2)=='#') {
                list.add(Integer.parseInt(s.substring(i,i+2)));
                i+=3;
            }
            else {
                list.add(Character.getNumericValue(s.charAt(i)));
                i++;
            }
        }

        int[] arr = new int[list.size()];
        for (int i=0;i<arr.length;i++) {
            arr[i] = list.get(i);
        }
        return arr;
    }
}
