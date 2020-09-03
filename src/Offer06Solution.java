import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Definition for singly-linked list.
/* class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}*/

/*
public class Offer06Solution {
    public int[] reversePrint(ListNode head) {
        List<Integer> list=new ArrayList<>();
        while (head!=null){
            list.add(head.val);
            head=head.next;
        }
        Collections.reverse(list);
        Integer[] integers = list.toArray(new Integer[list.size()]);

        int[] res = new int[integers.length];
        for (int i=0;i<integers.length;i++){
            res[i]=integers[i];
        }
        return res;
    }
}*/
