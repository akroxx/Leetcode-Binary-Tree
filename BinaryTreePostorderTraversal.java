import java.util.LinkedList;

import javax.swing.tree.TreeNode;

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
    public List<Integer> postorderTraversal(TreeNode root) {
        LinkedList<TreeNode> stack = new LinkedList<>();
        List<Integer> output = new ArrayList<>();

        if(root == null) return output;

        stack.push(root);
        
        while( !stack.isEmpty()){
            TreeNode node = stack.pollLast();
            output.add(node.val);
            
            if(node.left != null){
                // output.add(node.val);
                stack.push(node.left);
            }

            if( node.right != null){
                // output.add(node.val);
                stack.push(node.right);
            }
        }
        while(!stack.isEmpty()){
            
        }
        return output;
    }
}