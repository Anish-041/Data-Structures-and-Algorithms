package Leetcode;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;

public class code38 {
    public static void main(String[] args) {
        String[] str = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(str));
    }

    public static String longestCommonPrefix(String[] strs) {
        StringBuilder str = new StringBuilder();
        String[] arr = new String[strs.length-1];
        int i=0;
        while (i<=strs.length-1 && i+1<strs.length) {
            char[] ch1 = extract(strs[i]);
            char[] ch2 = extract(strs[i+1]);
            String s1 = compare1(ch1,ch2);
            arr[i] = s1;
            i++;
        }
        if (arr.length==1) {
            return arr[0];
        }
        int j=1;
        String ans=arr[0];
        while (j<=arr.length-1) {
            if (arr[j].isEmpty() || ans.isEmpty()) {
                return "";
            }
            ans = compare2(ans,arr[j]);
            j++;
        }
        str.append(ans);
        return str.toString();
    }

    public static char[] extract(String s) {
        char[] ch = s.toCharArray();
        return ch;
    }

    public static String compare1(char[] ch1,char[] ch2) {
        int i=0;;
        int j=0;
        StringBuilder str = new StringBuilder();
        while (i<ch1.length && j<ch2.length) {
            if (ch1[i]==ch2[j]) {
                str.append(ch1[i]);
                i++;
                j++;
            }
            else if (ch1[i]!=ch2[j]) {
                return str.toString();
            }
        }
        return str.toString();
    }

    public static String compare2(String s1, String s2) {
        StringBuilder ans = new StringBuilder();
        int i=0;
        int j=0;

        while (i<=s1.length()-1 && j<=s2.length()-1) {
            if (s1.charAt(i)==s2.charAt(j)) {
                ans.append(s1.charAt(i));
                i++;
                j++;
            }
            else if (s1.charAt(i) != s2.charAt(j)) {
                return ans.toString();
            }
        }
        return ans.toString();
    }
}


