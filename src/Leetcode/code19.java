package Leetcode;

public class code19 {
    public static void main(String[] args) {

    }

    public static int minCostToMoveChips(int[] position) {
        int even = 0;
        int odd = 0;
        for (int i=0;i<position.length;i++) {
            if (position[i]%2==0) {
                even+=1;
            } else odd+=1;
        }

        return Math.min(odd,even);
    }
}
