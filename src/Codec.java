/*
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        return reserialize(root,"");
    }
    private String reserialize(TreeNode root,String s){
        if (root==null){
            s+="#,";
            return s;
        }
        s+=root.val;
        s+=",";
        s=reserialize(root.left,s);
        s=reserialize(root.right,s);
        return s;
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] split = data.split(",");
        List<String> list=new LinkedList<String>(Arrays.asList(split));
        return redeserialize(list);
    }
    private TreeNode redeserialize(List<String> list){
        if (list.size()==0||list.get(0).equals("#")){
            list.remove(0);
            return null;
        }
        TreeNode t=new TreeNode(Integer.parseInt(list.get(0)));
        list.remove(0);
        t.left=redeserialize(list);
        t.right=redeserialize(list);

        return t;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.deserialize(codec.serialize(root));*/
