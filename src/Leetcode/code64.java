package Leetcode;

import java.util.ArrayList;
import java.util.List;

class Node {
    int val;

    Node left;
    Node right;
    public Node (int val) {
         this.val = val;
    }
}
public class code64 {

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        List<Integer> ans =preorderTraversal(root);
        System.out.println(ans);
    }

    public static List<Integer> preorderTraversal(Node root) {
        List<Integer> res = new ArrayList<>();
        preorder(root,res);
        return res;
    }

    public static void preorder(Node root , List<Integer> list) {
        if (root == null) return;
        list.add(root.val);
        preorder(root.left , list);
        preorder(root.right , list);
    }
}
