/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
//revised once
class Solution {
    
    
    public boolean isSameTree(TreeNode p, TreeNode q) {
        
        if ( p == null && q == null ) 
            return true;
        if ( p == null || q == null )
            return false;
        
        ArrayDeque<TreeNode> tree1 = new ArrayDeque<>();
        ArrayDeque<TreeNode> tree2 = new ArrayDeque<>();
        
        tree1.addLast(p);
        tree2.addLast(q);
            
        while ( !(tree1.isEmpty()) || !(tree1.isEmpty())) {
            TreeNode firstElementTree1 = tree1.removeFirst();
            TreeNode firstElementTree2 = tree2.removeFirst();
            
            if ( firstElementTree1.val != firstElementTree2.val ) {
                return false;
            }
            
            
            if ( firstElementTree1.left != null && firstElementTree2.left != null ){
                if (firstElementTree1.left.val !=firstElementTree2.left.val )
                    return false;
            }  else if ( firstElementTree1.left == null ^ firstElementTree2.left == null  )
                return false;
            
            
            
            if ( firstElementTree1.right != null && firstElementTree2.right != null ){
                if (firstElementTree1.right.val !=firstElementTree2.right.val )
                    return false;
            } else if ( firstElementTree1.right == null ^ firstElementTree2.right == null  )
                return false;
            
            
            
            
            if ( firstElementTree1.left != null )
                tree1.addLast(firstElementTree1.left);
            if ( firstElementTree1.right != null )
                tree1.addLast(firstElementTree1.right);
            if (firstElementTree2.left != null )
                tree2.addLast(firstElementTree2.left);
            if (firstElementTree2.right != null )
                tree2.addLast(firstElementTree2.right);
        }
        
        return true;
        
    }
}













