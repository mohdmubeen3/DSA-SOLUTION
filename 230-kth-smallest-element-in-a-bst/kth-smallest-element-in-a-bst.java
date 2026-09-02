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
    int count = 0;
    int res = 0;

    public void xyz(TreeNode root, int k){
        if(root == null) return ;

        xyz(root.left, k);
        count++;
        

        if(count == k){

            res = root.val;
          
           
            


        }

         xyz(root.right, k);



        

        

    }
    public int kthSmallest(TreeNode root, int k) {

       xyz(root, k);
       return res;
      

        
    }
}