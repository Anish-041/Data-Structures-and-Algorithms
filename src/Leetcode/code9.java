package Leetcode;

public class code9 {
    public static void main(String[] args) {

    }

    public static int largestAltitude(int[] gain) {
        int[] arr = new int[gain.length+1];
        arr[0] = 0;
        int net = 0;
        for (int i=0;i<gain.length;i++) {
            net = net + gain[i];
            arr[i+1] = net;
        }
        int max=  0;
        for (int i:arr) {
            if (i>max) max = i;
        }
        return max;
    }
}
