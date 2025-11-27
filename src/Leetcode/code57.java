package Leetcode;

public class code57 {
    public static void main(String[] args) {
        int[] arr = {2,4,1};
        System.out.println(maxProfit(arr));
    }

    /// TLE SOL
//    public static int maxProfit(int[] prices) {
//        int n = prices.length;
//        int maxprofit = 0;
//
//        for (int i=0;i<n;i++) {
//            maxprofit = Math.max(maxprofit,profit(i,prices));
//        }
//        return maxprofit;
//    }
//
//    public static int profit(int i,int[] arr) {
//        int ans = 0;
//        for (int k=i+1;k<arr.length;k++) {
//            ans = Math.max(ans,arr[k]-arr[i]);
//        }
//        return ans;
//    }

    public static int maxProfit(int[] prices) {
        int n = prices.length;
        int profit = 0;
        int buy = prices[0];

        for (int i=0;i<n;i++) {
            if (prices[i]< buy) {
                buy = prices[i];
            }
            else if(prices[i]-buy> profit) {
                profit = prices[i] - buy;
            }
        }
        return profit;
    }
}
