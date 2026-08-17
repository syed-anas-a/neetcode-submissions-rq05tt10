/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null) return 0;
        int leftD = diameterOfBinaryTree(root.left);
        int rightD = diameterOfBinaryTree(root.right);
        int currentD = height(root.left) + height(root.right);
        return Math.max(Math.max(currentD, leftD), rightD);
    }
    public int height(TreeNode root) {
        if(root == null) return 0;
        int leftH = height(root.left);
        int rightH = height(root.right);
        return Math.max(leftH, rightH) + 1;
    }
}
