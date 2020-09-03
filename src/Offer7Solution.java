/*
import java.util.HashMap;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

public class Offer7Solution {
    HashMap<Integer, Integer> map=null;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        map= new HashMap<>();
        for (int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }
        return  buildTree(preorder,inorder,0,preorder.length-1,0,inorder.length-1);

    }
    private TreeNode buildTree(int[] preorder,int[] inorder,int prel,int prer,int inl,int inr){
        if (prel==prer){
            return new TreeNode(preorder[prel]);
        }
        if (prel>prer||inl>inr||inl<0||prel<0||inr>=inorder.length||prer>=inorder.length){
            return null;
        }
        TreeNode root=new TreeNode(preorder[prel]);
        Integer rootin = map.get(preorder[prel]);
        int numl=rootin-inl;
        root.left=buildTree(preorder,inorder,prel+1,prel+numl,inl,rootin-1);
        root.right=buildTree(preorder,inorder,prel+numl+1,prer,rootin+1,inr);
        return root;
    }
}*/
