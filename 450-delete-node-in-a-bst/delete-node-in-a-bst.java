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

    public TreeNode rightSuccc(TreeNode root){
        if(root == null) return null;

        TreeNode curr = root;
        while(curr.left != null){
            curr = curr.left;
        }

        return curr;
    }

    public TreeNode xyz(TreeNode root, int key){
        if(root == null) return null;
        if(root.val < key){
            root.right = xyz(root.right, key);
        } else if(root.val > key ){
            root.left =  xyz(root.left, key);
        } else {
            if(root.right != null && root.left != null){
                
                TreeNode replace = rightSuccc(root.right);
                root.val = replace.val;


                root.right = xyz(root.right, replace.val);

            } else if(root.left == null) {
                return root.right;
            } else if(root.right == null){
                return root.left;
            } else {
                return null;
            }
        }

        return root;
    }
    public TreeNode deleteNode(TreeNode root, int key) {

        return xyz(root, key);
        
    }
}