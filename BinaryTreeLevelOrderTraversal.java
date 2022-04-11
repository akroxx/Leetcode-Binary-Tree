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
// class Solution {

//     List<List<Integer>> levels = new ArrayList<List<Integer>>();

//     public void helper(TreeNode node, int level){
//         // start the current level
//         if(levels.size() == level){
//             levels.add(new ArrayList<Integer>());
//             // New Integer ArrayList added to levels
//         }

//         // fulfil the current level
//         levels.get(level).add(node.val);

//         // Process child nodes for next level
//         if(node.left != null){
//             helper(node.left, level +1);
//         }
//         if(node.right != null){
//             helper(node.right, level +1);
//         }
//     }

//     public List<List<Integer>> levelOrder(TreeNode root) {
//         if (root == null) return levels;
//         helper(root, 0);
//         return levels;
//     }
// }

/** THE ABOVE SOLUTION IS RECURSIVE SOLUTION APPROCH AS PER LEETCODE SOLUTIONS */

/** THE BELOW SOLUTION IS ITERATIVE SOLUTION APPROACH */

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
    public List<List<Integer>> levelOrder(TreeNode root) {
        
        // Creating return type
        List<List<Integer>> levels = new ArrayList<List<Integer>>();
        
        // Edge case returns empty of return type
        if(root == null) return levels;
        
        // Creating Queue based on LinkedList of TreeNode data structure
        Queue<TreeNode> queue = new LinkedList<TreeNode>();

        //  Integer to hold level number in 2-D List<List<Integer>>
        int level = 0;

        // Adds root of tree to queue
        queue.add(root);

        // Running until the queue is empty
        while( !queue.isEmpty()){
            // Adding a new ArrayList<Integer> level to the List<List<>> for adding new level
            levels.add(new ArrayList<Integer>());

            // Calculating number of elements in the current level
            int lenLevel = queue.size();

            // Loop goes on until all elements in the current level are addressed
            for(int i = 0; i < lenLevel; i++){
                // queue.remove() removes first element from the queue and assigns to node'
                TreeNode node = queue.remove();

                // Adding value to current level of levels List<List<Integer>>
                levels.get(level).add(node.val);

                // Addressing immediate children of the current node that might or might not
                // exist in the sub-tree of the current node
                if(node.left != null) queue.add(node.left);
                if(node.right != null) queue.add(node.right);

            }
            level++;
            // level number incremented every time the current level iteration is over with the
            // for loop
        }
        return levels;
    }
}