package Leetcode;

public class code14 {
    public static void main(String[] args) {

    }
    /* This solution works only when we can have duplicate elements in the array*/
    public static int[] sumZero(int n) {
        int[] ans = new int[n];
        if (n==1) {
            return new int[1];
        }
        int l = ans.length;
        int i=1;
        int j=1;
        int mid = n/2;
        ans[mid] = 0;
        while (l>0 && mid+i<n) {
            ans[mid+i] = j;
            ans[mid-i] = -j;
            i++;
            j++;
            l--;
        }
        if (sumOfArray(ans) == 0) {
            return ans;
        }
        else return new int[0];
    }

    /* This works for all*/
    public  static int[] sumzero(int n) {
        int[] ans = new int[n];
        int index = 0;
        for (int i = 1; i <= n / 2; i++) {
            ans[index++] = i;
            ans[index++] = -i;
        }
        if (n % 2 != 0) {
            ans[index] = 0;
        }

        return ans;
    }

    public static int sumOfArray(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }
}
