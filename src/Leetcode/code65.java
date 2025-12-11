package Leetcode;


import java.util.ArrayList;
import java.util.List;

public class code65 {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        List<Integer> ans = inorderTraversal(root);
        System.out.println(ans);
    }

    public static List<Integer> inorderTraversal(Node root) {
        List<Integer> res = new ArrayList<>();
        inorder(root , res);
        return res;
    }

    public static void inorder(Node root , List<Integer> list) {
        if (root == null) return;
        inorder(root.left, list);
        list.add(root.val);
        inorder(root.right, list);
    }
}
