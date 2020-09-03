/*

//Definition for a binary tree node.
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

public class Solution124 {
    int res=Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        helper(root);
        return res;
    }
    private int helper(TreeNode root){
        if (root==null){
            return 0;
        }
        int right = Math.max(helper(root.right),0);
        int left = Math.max(helper(root.left),0);
        res=Math.max(res,right+left+root.val);
        return root.val+Math.max(right,left);

    }
}*/
