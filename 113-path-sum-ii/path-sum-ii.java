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

    List<List<Integer>> ans = new ArrayList<>();



    public List<List<Integer>> xyz(TreeNode root, int sum, List<Integer> current){
        if(root == null) return ans;

        current.add(root.val);
        if(sum == root.val && root.left == null && root.right == null){
            ans.add(new ArrayList<>(current));
        }


        xyz(root.left, sum - root.val, current);
        xyz(root.right, sum - root.val, current);

        current.remove(current.size() - 1);

        return ans;


    }
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {

        ArrayList<Integer> list = new ArrayList<>();

        return xyz(root, targetSum, list);
        
    }
}