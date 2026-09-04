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

    public int xyz(TreeNode root, int current){
        if(root == null) return 0;

        current = 10 * current + root.val;

        if(root.left == null && root.right == null){
            return current;
        }

        int left = xyz(root.left, current);
        int right = xyz(root.right, current);

        return left + right;
    }
    public int sumNumbers(TreeNode root) {

        return xyz(root, 0);
        
    }
}