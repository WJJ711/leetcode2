/*
import java.util.HashMap;
import java.util.Map;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

public class Solution105 {
    Map<Integer,Integer> map;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        map=new HashMap<>();
        for (int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }
        return helper(preorder,0,preorder.length-1,inorder,0,inorder.length-1);
    }
    private TreeNode helper(int[] preorder,int prel,int prer,int[] inorder,int inl,int inr){
        if (prel>prer){
            return null;
        }
        TreeNode root = new TreeNode(preorder[prel]);
        Integer inIndex = map.get(preorder[prel]);
        root.left=helper(preorder,prel+1,(inIndex-1)-inl+prel+1,inorder,inl,inIndex-1);
        root.right=helper(preorder,(inIndex-1)-inl+prel+1+1,prer,inorder,inIndex+1,inr);
        return root;
    }
}*/
