//https://leetcode.com/problems/maximum-depth-of-binary-tree/
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    
    public int findDepth (TreeNode root) {
        if ( root == null ) 
            return 0;
        
        if( root.left == null && root.right == null) 
            return 1;
    
        int leftHeight = findDepth ( root.left) + 1;
        int rightHeight = findDepth ( root.right)  + 1;

        if ( leftHeight >= rightHeight ) return leftHeight;
        return rightHeight;
    }
    
    public int maxDepth(TreeNode root) {
        return findDepth( root);    
    }
}
