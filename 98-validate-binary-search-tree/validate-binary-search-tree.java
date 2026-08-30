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

    Long prev = Long.MIN_VALUE;

    public boolean xyz(TreeNode root){
        if(root == null) return true;

      

        if(!xyz(root.left)) return false;
        long data = root.val;
        

        if(prev >= data) return false;

        prev = data;
        return xyz(root.right);

        



    }
    public boolean isValidBST(TreeNode root) {
        return xyz(root);
    }
}