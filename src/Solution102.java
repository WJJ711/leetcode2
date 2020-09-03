/*
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

public class Solution102 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list=new ArrayList<>();
        Queue<TreeNode> queue=new LinkedList<>();
        if (root==null){
            return list;
        }
        queue.offer(root);
        while (!queue.isEmpty()){
            int n = queue.size();
            List<Integer> temp=new ArrayList<>();
            for (int i=0;i<n;i++){
                TreeNode poll = queue.poll();
                temp.add(poll.val);
                if (poll.left!=null){
                    queue.offer(poll.left);
                }
                if (poll.right!=null){
                    queue.offer(poll.right);
                }
            }
            list.add(temp);
        }
        return list;
    }
}*/
