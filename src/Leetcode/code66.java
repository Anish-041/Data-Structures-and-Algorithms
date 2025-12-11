package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class code66 {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        List<Integer> ans = postorderTraversal(root);
        System.out.println(ans);
    }

    public static List<Integer> postorderTraversal(Node root) {
        List<Integer> res = new ArrayList<>();
        postorder(root , res);
        return res;
    }

    public static void postorder(Node root , List<Integer> list) {
        if (root == null) return;

        postorder(root.left , list);
        postorder(root.right , list);
        list.add(root.val);
    }
}
