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

    public TreeNode xyz(int[] preorder, int preStart, int preEnd, int[] inorder, int inStart, int inEnd){
         if(preStart > preEnd || inStart > inEnd) return null;
        TreeNode root = new TreeNode(preorder[preStart]);

       

        int inIndex = inStart;
        for(int i = inStart; i<=inEnd; i++){
           
            if(inorder[i] == root.val) {
                inIndex = i;
                break;
            }
        }

        int leftLen = inIndex - inStart;


        root.left = xyz(preorder, preStart + 1, preStart + leftLen, inorder, inStart , inIndex - 1);
        root.right = xyz(preorder, preStart + leftLen + 1, preEnd, inorder,  inIndex + 1, inEnd);

        return root;
    }


    public TreeNode buildTree(int[] preorder, int[] inorder) {

        return xyz(preorder, 0, preorder.length - 1, inorder, 0, inorder.length -1);
        
        
    }
}