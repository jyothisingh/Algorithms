/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
 //https://leetcode.com/problems/symmetric-tree/submissions/
class Solution {
    public boolean testSymm (TreeNode l, TreeNode r) {
        
        if ( l == null && r == null ) {
            return true;
        }
        else if ( l == null || r == null ) {
            return false;
        } 
        
        if ( l != null && r != null ) {
            if ( l.val != r.val) {
                return false;
            }
        }
         return testSymm (l.left, r.right) &&
         testSymm (l.right,r.left);
    }
    public boolean isSymmetric(TreeNode root) {
    
        if ( root == null )
            return true;

        return testSymm(root.left, root.right);
    }
}
