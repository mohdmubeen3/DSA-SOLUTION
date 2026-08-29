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
    public int xyz(TreeNode root){

        if(root == null) return 0;
        int leftH = xyz(root.left);
        int rightH = xyz(root.right);

        if(leftH == -1 || rightH == -1) return -1;

        if(Math.abs(leftH - rightH) > 1) return -1;
        
        return 1 + Math.max(leftH, rightH);
    }
    public boolean isBalanced(TreeNode root) {

        if(root == null) return true;

        if(xyz(root) == -1) return false;
        else return true;
        
    }
}