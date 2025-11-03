package Leetcode;

public class code51 {
    public static void main(String[] args) {
        System.out.println(isPerfectSquare(16));
    }

    public static boolean isPerfectSquare(int num) {
        if (num==1 || num==0) return true;
        int start = 1;
        int end = num;

        while (start<=end) {
            int mid = start + (end-start) / 2;
            long product = (long)mid*mid;

            if (product == num) {
                return true;
            }
            else if (product < num){
                start = mid+1;
            }
            else {
                end = mid-1;
            }
        }
        return false;
    }
}
