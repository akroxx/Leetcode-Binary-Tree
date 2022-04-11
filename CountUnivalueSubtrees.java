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
    int count =0;
    boolean isUni(TreeNode node){
        if (node.left == null && node.right == null){
            count++;
            return true;
        }

        boolean isUnival = true;

        if(node.left !=null){
            isUnival = isUni(node.left) && isUnival && node.left.val == node.val;
        }

        if(node.right != null){
            isUnival = isUni(node.right) && isUnival && node.right.val == node.val;
        }

        if(!isUnival) return false;
        count ++;
        return true;
    }
    public int countUnivalSubtrees(TreeNode root) {
        
        if(root = null) return 0;
        isUni(root);
        return count;
    }
    
}