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
    TreeNode prev = null;
    int minDiff = Integer.MAX_VALUE;

    public void xyz(TreeNode root){

        if(root == null) return;
        xyz(root.left);
        if(prev != null){
            minDiff = Math.min(minDiff, Math.abs(root.val - prev.val));

        }

        prev = root;
        xyz(root.right);
        

    }
    public int getMinimumDifference(TreeNode root) {

        xyz(root);
        return minDiff;
        
    }
}