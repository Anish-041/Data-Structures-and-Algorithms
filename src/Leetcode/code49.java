package Leetcode;

public class code49 {
    public static void main(String[] args) {
        System.out.println(firstBadVersion(5));
    }

    public static int firstBadVersion(int n) {
        // if (n==1) return n;
        int start = 0;
        int end = n;

        while (start<=end) {
            int mid = start + (end - start)/2;
            boolean target = isBadVersion(mid);

            if (target == true) {
                end = mid-1;
            }
            else if (target == false) {
                start = mid+1;
            }
        }
        return start;
    }

    private static boolean isBadVersion(int version) {
        int bad = 4;
        return version == bad;
    }
}
