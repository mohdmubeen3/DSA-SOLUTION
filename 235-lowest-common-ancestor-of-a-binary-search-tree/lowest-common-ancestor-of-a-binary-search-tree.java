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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        TreeNode res = new TreeNode(0);

        while(root != null){

       
        
        if((p.val <= root.val && q.val >= root.val) || (p.val >= root.val && q.val <= root.val) ){
            return root;
        } else if(p.val < root.val && q.val < root.val){
            root = root.left;
        } else {
            root = root.right;
        }

        }

        return res;



    }
}