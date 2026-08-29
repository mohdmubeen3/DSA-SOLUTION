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
    int diam = 0;

    public int xyz(TreeNode root){

        if(root == null) return 0;

        int leftH = xyz(root.left);
        int rightH =  xyz(root.right);

        diam = Math.max(diam, leftH + rightH );

        return 1 + Math.max(leftH, rightH);




    }

    public int diameterOfBinaryTree(TreeNode root) {

        if(root == null) return 0;

        xyz(root);

        return diam;


        
    }
}