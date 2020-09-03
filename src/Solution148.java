 class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

public class Solution148 {
    public ListNode sortList(ListNode head) {
        if (head==null){
            return null;
        }
        if (head.next==null){
            return head;
        }
        ListNode slow=head;
        ListNode fast=head.next;
        while (fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode p = slow.next;
        slow.next=null;
        ListNode left = sortList(head);
        ListNode right = sortList(p);
        ListNode res=new ListNode(0);
        ListNode temp=res;
        while (right!=null&&left!=null){
            if (right.val<left.val){
                res.next=right;
                right=right.next;
            }else {
                res.next=left;
                left=left.next;
            }
            res=res.next;
        }
        if (right!=null){
            res.next=right;
        }
        if (left!=null){
            res.next=left;
        }
        return temp.next;
    }
}