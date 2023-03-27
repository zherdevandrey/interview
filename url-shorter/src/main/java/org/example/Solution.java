package org.example;

class Solution {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(3);
        root.left.left.left = new TreeNode(4);
        root.left.left.right = new TreeNode(4);
        isBalanced(root);
    }

    public static boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        if (root != null && root.left == null && root.right == null) {
            return true;
        }
        int delta = length(root.left) - length(root.right);
        if (delta == 0 || delta == 1 || delta == -1) {
            return true;
        }
        return false;
    }

    private static int length(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return Math.max(length(root.left), length(root.right)) + 1;
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}