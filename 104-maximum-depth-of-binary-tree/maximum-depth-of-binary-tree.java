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
import java.util.*;
class Solution {

    public int xyz(TreeNode root){
        int Lheight = 0;
        int Rheight = 0;

        if(root == null) return 0;

        Lheight = 1 + xyz(root.left);
        Rheight = 1 + xyz(root.right);

        return Math.max(Lheight, Rheight);


    }
    public int maxDepth(TreeNode root) {
        List<Integer> list = new ArrayList<>();

        return xyz(root);
    }
}