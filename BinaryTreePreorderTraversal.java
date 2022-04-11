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
    public List<Integer> preorderTraversal(TreeNode root) {
        
        LinkedList<TreeNode> stack = new LinkedList<>();
        List<Integer> output = new ArrayList<>();
        
        // For empty tree i.e. no root; no node
        if(root == null) return output;

        /**
         * Pre order traversal follows :
         *  1. Visit root
         *  2. traverse left sub-tree
         *  3. traverse right sub-tree
         */
        stack.add(root);    //Adding first root to the stack

        while(!stack.isEmpty()){
            TreeNode node = stack.pollLast();
            output.add(node.val);
            if(node.right != null){
                stack.add(node.right);
            }
            if (node.left != null){
                stack.add(node.left);
            }
        }
        return output;
    }
}