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
    
    
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if ( p == null && q == null )
            return true;
        if ( p == null || q == null ) 
            return false;
        ArrayDeque<TreeNode> t1 = new ArrayDeque<>();
        ArrayDeque<TreeNode> t2 = new ArrayDeque<>();
        
        t1.addLast(p);
        t2.addLast(q);
    
        while ( t1.toArray().length != 0 && t2.toArray().length != 0  ) {
                            
            TreeNode rem1 = t1.removeFirst();
            TreeNode rem2 = t2.removeFirst();
            
            if ( rem1.val != rem2.val ) {
                return false;
            }
            
            TreeNode l1 = rem1.left;
            TreeNode r1 = rem1.right;
            
            TreeNode l2 = rem2.left;
            TreeNode r2 = rem2.right;
            
            if ( l1 != null && l2 != null ) {
                if ( l1.val != l2.val )
                    return false;
            } else if (r1 == null  ^ r2 == null ) {
                    return false;
            } 
            if ( r1 != null && r2 != null ) {
                if ( r1.val != r2.val )
                    return false;
            } else if ( r1 == null ^ r2 == null) {
                    return false;
            }
        
            if ( l1 != null ) t1.addLast(l1);
            if ( r1 != null ) t1.addLast(r1);
            if ( l2 != null ) t2.addLast(l2);
            if ( r2 != null ) t2.addLast(r2);
        
        }
        
        if( t1 == null && t2 == null ) {
            return true;
        }
        if ( t1 == null || t2 == null ) {
            return false;
        }
        return true;
        
    }
}
