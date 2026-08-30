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

    public void xyz(TreeNode root, StringBuilder sb, List<String> list){

        int old = sb.length();

        sb.append(root.val);
        if(root.left == null && root.right == null){
            list.add(sb.toString());
        } else {
            sb.append("->");
            if(root.left != null){
                xyz(root.left, sb, list);
            } 
            if(root.right != null){
                xyz(root.right, sb, list);
            }
        }

        sb.setLength(old);




        



       
      




    }
    public List<String> binaryTreePaths(TreeNode root) {

        StringBuilder sb = new StringBuilder();
        List<String> list = new ArrayList<>();

        if(root != null){
              xyz(root, sb, list);

        }

        return  list;

       
        
    }
}