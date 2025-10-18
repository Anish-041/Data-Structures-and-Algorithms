package Leetcode;

public class code46 {
    public static void main(String[] args) {
        int x = 4;
        System.out.println(mySqrt(x));
    }

    public static int mySqrt(int x) {
        long l=0;
        long r=x;
        int ans=0;

        while (l<=r) {
            long mid = (l+r)/2;
            if (mid*mid<=x) {
                ans = Math.max(ans,(int)mid);
                l = mid+1;
            } else {
                r=mid-1;
            }
        }
        return ans;
    }
}
