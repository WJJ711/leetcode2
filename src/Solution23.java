import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

//Definition for singly-linked list.
/*class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}*/

/**
 * 暴力解
 */
/*
public class Solution23 {
    public ListNode mergeKLists(ListNode[] lists) {
        int k = lists.length;
        ListNode head=new ListNode();
        ListNode p=head;
        while (true){
            ListNode minNode=null;
            int minPointer=-1;
            for (int i=0;i<k;i++) {
                if (lists[i] == null) {
                    continue;
                }
                if (minNode==null||minNode.val>lists[i].val){
                    minNode=lists[i];
                    minPointer=i;
                }
            }
            if (minNode==null){
                break;
            }
            p.next=minNode;
            p=p.next;
            lists[minPointer]=lists[minPointer].next;

        }
        return head.next;
    }
}*/

/**
 * 用堆
 */
/*
public class Solution23 {
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> queue = new PriorityQueue<>(new Comparator<ListNode>() {
            @Override
            public int compare(ListNode o1, ListNode o2) {
                return o1.val-o2.val;
            }
        });
        for (ListNode node : lists) {
            if (node!=null){
                queue.offer(node);
            }
        }
        ListNode head=new ListNode();
        ListNode p=head;
        while (!queue.isEmpty()){
            ListNode node = queue.poll();
            p.next=node;
            p=p.next;
            if (node.next!=null){
                queue.offer(node.next);
            }
        }
        return head.next;
    }
}*/
