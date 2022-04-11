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
    public boolean isSymmetric(TreeNode root) {
        return isMirror(root, root);
        // Function called
    }

    public boolean isMirror(TreeNode t1, TreeNode t2){
        if (t1 == null && t2 == null) return true;      // If both are null i.e empty tree is considered symmetric
        if (t1 == null || t2 == null) return false;     // If either one holds nodes and other doesn't then not symmetric
        return (t1.val == t2.val)                       // Master return condition statement meaning that, if both values match
            && isMirror(t1.right, t2.left)              // and if the right subtree of node and left of the second node match
            && isMirror(t1.left, t2.right);             // and if left subtree of node and right of second node match
                                                        // Such that, a symmetry line make cause them to overlap perfectly together.!s
    }
}