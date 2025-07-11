 import java.util.*;

public class TreeOperations {
    
    // Tree Node definition
    static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

    // Count total nodes in a binary tree
    public static int countOfNodes(TreeNode root) {
        if (root == null) return 0;
        return countOfNodes(root.left) + countOfNodes(root.right) + 1;
    }

    // Calculate height of a binary tree
    public static int height(TreeNode root) {
        if (root == null) return 0;
        return Math.max(height(root.left), height(root.right)) + 1;
    }

    // Calculate diameter of a binary tree (slow version)
    public static int diameter(TreeNode root) {
        if (root == null) return 0;
        int d1 = diameter(root.left);
        int d2 = diameter(root.right);
        int d3 = height(root.left) + height(root.right) + 1;
        return Math.max(d3, Math.max(d1, d2));
    }

    // Subtree checking utilities
    static class Solution {
        public boolean isIdentical(TreeNode root, TreeNode subRoot) {
            if (root == null && subRoot == null) return true;
            if (root == null || subRoot == null) return false;
            if (root.val != subRoot.val) return false;
            return isIdentical(root.left, subRoot.left) &&
                   isIdentical(root.right, subRoot.right);
        }

        public boolean isSubtree(TreeNode root, TreeNode subRoot) {
            if (subRoot == null) return true;
            if (root == null) return false;
            if (isIdentical(root, subRoot)) return true;
            return isSubtree(root.left, subRoot) ||
                   isSubtree(root.right, subRoot);
        }
    }

    // Main method to test functionality
    public static void main(String[] args) {
        // Example tree:
        /*
                1
               / \
              2   3
             / \
            4   5
        */
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        System.out.println("Total Nodes: " + countOfNodes(root));  // 5
        System.out.println("Height: " + height(root));             // 3
        System.out.println("Diameter: " + diameter(root));         // 4

        // Subtree check
        TreeNode subRoot = new TreeNode(2);
        subRoot.left = new TreeNode(4);
        subRoot.right = new TreeNode(5);

        Solution sol = new Solution();
        System.out.println("Is Subtree: " + sol.isSubtree(root, subRoot));  // true
    }
}
