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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        return getLCA(root, p, q);
    }
    public TreeNode getLCA(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null) return null;
        if(root.val == p.val || root.val == q.val) return root;
        TreeNode leftLCA = null, rightLCA = null;
        if(root.val > p.val && root.val > q.val) {
            return getLCA(root.left, p, q);
        }
        else if(root.val < p.val && root.val < q.val) {
            return getLCA(root.right, p, q);
        }
        else {
            return root;
        }
    }
}
