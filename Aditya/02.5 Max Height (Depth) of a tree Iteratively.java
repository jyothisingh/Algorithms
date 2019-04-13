/// ...........ITERATIVELY...
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
        public int maxDepth(TreeNode root) {
            if (root == null )
                return 0;
            ArrayDeque<TreeNode> tree = new ArrayDeque<>();            
            tree.addLast(root);
            TreeNode lastElementInRow = root;
            int counter = 0;
            while ( ! tree.isEmpty() ) {
                TreeNode ptr = tree.removeFirst();
                TreeNode L = ptr.left;
                TreeNode R = ptr.right;
                if ( L != null ) tree.addLast(L);
                if ( R != null) tree.addLast(R);
                if ( ptr == lastElementInRow ) {
                    counter += 1;
                    lastElementInRow = tree.peekLast();
                }
            }
            return counter;
        }
}
