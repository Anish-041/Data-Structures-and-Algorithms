package Leetcode;

import java.util.Arrays;
import java.util.Stack;

public class code53 {
    public static void main(String[] args) {
//        int[] arr = {5,10,-5};
//        int[] arr = {8,-8};
        int[] arr = {3,5,-6,2,-1,4};
        System.out.println(Arrays.toString(asteroidCollision(arr)));
    }

    public static int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        for (int a : asteroids) {
            boolean destroyed  = false;

            while (!stack.isEmpty() && a<0 && stack.peek()>0) {

                int top = stack.peek();

                if (top<-a) {
                    stack.pop();
                }
                else if (top==-a) {
                    stack.pop();
                    destroyed = true;
                    break;
                }
                else {
                    destroyed = true;
                    break;
                }
            }

            if (!destroyed){
                stack.push(a);
            }
        }

        int[] res = new int[stack.size()];
        for (int i=res.length-1;i>=0;i--) {
            res[i] = stack.pop();
        }
        return res;
    }
}
