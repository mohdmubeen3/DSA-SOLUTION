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

    ArrayList<Integer> list  = new ArrayList<>();

    public List<Integer> xyz(TreeNode root){
        if(root == null) return list;



        xyz(root.left);
        list.add(root.val);
        xyz(root.right);

        return list;

    }
    public int kthSmallest(TreeNode root, int k) {

        xyz(root);
        return list.get(k-1);

        
    }
}