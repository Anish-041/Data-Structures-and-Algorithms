package Leetcode;

public class code17 {
    public static void main(String[] args) {

    }

    public static int[] plusOne(int[] digits) {
        int n = digits.length;
        boolean al9s = true;
        for (int i=0;i<digits.length;i++) {
            if(digits[i]!=9) {
                al9s = false;
            }
        }
        if (n==1) {
            int end = digits[0]+ 1;
            int l = count(end);
            int[] ans = new int[l];
            int index=l-1;
            while(end>0) {
                int rem = end%10;
                ans[index--] = rem;
                end=end/10;
            }
            return ans;
        }

        else if (al9s) {
            int[] arr = new int[n+1];
            arr[0] =1;
            return arr;
        }
        else if (digits[n-1]==9 && digits[n-2]==9) {
            StringBuilder str = new StringBuilder();
            for (int i: digits) {
                str.append(i);
            }
            int number = Integer.parseInt(str.toString());
            int sum = number+1;
            int l = count(sum);
            int[] arr = new int[l];
            int index = l-1;
            while (sum>0) {
                int rem = sum % 10;
                arr[index--] = rem;
                sum = sum/10;
            }
            return arr;
        }
        else if (digits[n-1]==9) {
            digits[n-2] = digits[n-2] + 1;
            digits[n-1] = 0;
        }
        else {
            int last = digits[digits.length-1]+ 1;
            digits[digits.length-1]= last;
        }
        return digits;
    }

    public static int count(int n) {
        int cnt=0;
        while(n>0) {
            int rem = n%10;
            cnt++;
            n=n/10;
        }
        return cnt;
    }
}
