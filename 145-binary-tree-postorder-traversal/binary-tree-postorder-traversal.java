import java.util.*;
class Solution {

    public void xyz(TreeNode root, List<Integer> list){
        if(root == null) return ;

        xyz(root.left, list);
        xyz(root.right, list);
        list.add(root.val);
    }
    public List<Integer> postorderTraversal(TreeNode root) {

        List<Integer> list = new ArrayList<>();

        xyz(root, list);

        return list;
        
    }
}