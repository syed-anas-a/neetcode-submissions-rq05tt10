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
    public boolean isValidBST(TreeNode root) {
        if(root == null) return true;
        return validate(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
    public boolean validate(TreeNode root, int min, int max) {
        if(root == null) return true;
        boolean leftVal = validate(root.left, min, root.val);
        boolean rightVal = validate(root.right, root.val, max);
        boolean currVal = (root.val > min && root.val < max) ? true : false;
        return leftVal && rightVal && currVal;
    }
}


// boolean leftVal = validate(root.left, );
//         boolean rightVal = isValidBST(root.right);
//         boolean currLeft = (root.left == null || (root.left != null && root.left.val < root.val)) ? true : false;
//         boolean currRight = (root.right == null || (root.right != null && root.right.val > root.val)) ? true : false;
//         return leftVal && rightVal && isValidBST(root);
