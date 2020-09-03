/*

//Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

public class Solution19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode pre = findNthFromEnd(head, n);
        if (pre==null){
            return head.next;
        }
        ListNode next = pre.next;
        pre.next=next.next;
        return head;

    }
    private ListNode findNthFromEnd(ListNode head,int n){
        ListNode p1=head,p2=head;
        for (int i=0;i<n&&p2!=null;i++){
            p2=p2.next;
        }
        if (p2==null){
            return null;
        }
        while (p2.next!=null){
            p1=p1.next;
            p2=p2.next;
        }
        return p1;
    }
}*/
