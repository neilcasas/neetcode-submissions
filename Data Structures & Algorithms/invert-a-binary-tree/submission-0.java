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
    public TreeNode invertTree(TreeNode root) {
        // base case: if the root is null, return null;
        if(root == null) return null;

        // create temp var for right, for swapping
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        // recursively call on left, and on right
        invertTree(root.left);
        invertTree(root.right);

        return root;
    }
}
