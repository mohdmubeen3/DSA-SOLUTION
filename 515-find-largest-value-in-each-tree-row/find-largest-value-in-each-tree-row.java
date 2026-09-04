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

    public List<Integer> largestValues(TreeNode root) {

        ArrayList<Integer> list = new ArrayList<>();
        if(root == null) return list;

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int n = q.size();
             int max = Integer.MIN_VALUE;
            for(int i = 1;  i<=n; i++){
                TreeNode node = q.poll();

                if(node.val > max){
                    max = node.val;

                }

                if(node.left != null) q.add(node.left);
                if(node.right != null) q.add(node.right);

                
            }
            list.add(max);
        }

        return list;
        
    }
}