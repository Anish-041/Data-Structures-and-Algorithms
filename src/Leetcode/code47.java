package Leetcode;
import java.util.*;
public class code47 {
    public static void main(String[] args) {
        int[] A =  {0,1,1,0,0,1,0,1,1,1,0,1,0,1,1};
        int[] B =  {0,0,1,0,0,1,1,1,1,1,0,1};

        System.out.println(Arrays.toString(solution(A,B)));
    }

    public static int[] solution(int[] A, int[] B) {
        long sum1 = negabinaryToLong(A);
        long sum2 = negabinaryToLong(B);

        long ans = sum1 + sum2;

        return longToNegabinary(ans);
    }

    private static long negabinaryToLong(int[] arr) {
        if (arr.length == 0) return 0;

        long sum = 0;
        long powerOfNegTwo = 1;

        // assuming least significant bit first (rightmost bit at end)
        for (int i = 0;i<arr.length;i++) {
            sum += arr[i] * powerOfNegTwo;
            powerOfNegTwo *= -2;
        }

        return sum;
    }

    private static int[] longToNegabinary(long number) {
        if (number == 0) return new int[]{0};

        List<Integer> digits = new ArrayList<>();
        long currentNumber = number;

        while (currentNumber != 0) {
            long remainder = currentNumber % -2;
            currentNumber /= -2;

            if (remainder < 0) {
                remainder += 2;
                currentNumber += 1;
            }

            digits.add((int) remainder);
        }


        int[] result = new int[digits.size()];
        for (int i = 0; i < digits.size(); i++) {
            result[i] = digits.get(i);
        }

        return result;
    }
}
