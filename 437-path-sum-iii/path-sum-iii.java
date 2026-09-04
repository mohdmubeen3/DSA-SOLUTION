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
    
    public int xyz(TreeNode root, long sum){
        int count = 0;
        if(root == null) return 0;
        if(root.val == sum) count++;
        count += xyz(root.left, sum - root.val);
        count += xyz(root.right, sum - root.val);

        return count;
    }
    public int pathSum(TreeNode root, int targetSum) {

        if(root == null) return 0;

        return xyz(root, (long) targetSum) + pathSum(root.left, targetSum) + pathSum(root.right, targetSum);
        
    }
}