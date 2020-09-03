/*


//Definition for a binary tree node.
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

public class Offer07Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return buildTree(preorder,inorder,0,preorder.length-1,0,inorder.length-1);
    }
    public TreeNode buildTree(int[] preorder,int[] inorder,int prel,int prer,int inl,int inr){
        if (prel>prer||inl>inr){
            return null;
        }
        TreeNode root=new TreeNode(preorder[prel]);
        int inroot=inl;
        while (inorder[inroot]!=preorder[prel]){
            inroot++;
        }
        root.left=buildTree(preorder,inorder,prel+1,prel+1+(inroot-1-inl),inl,inroot-1);
        root.right=buildTree(preorder,inorder,prel+1+(inroot-1-inl)+1,prer,inroot+1,inr);
        return root;
    }

}*/
