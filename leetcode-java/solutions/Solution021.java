package solutions;
import utils.*;
public class Solution021 {
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l2 == null)
            return l1;
        if(l1 == null)
            return l2;
        ListNode head = new ListNode(0);
        ListNode cur = head;
        while(l1 != null && l2 != null){
            if(l1.val < l2.val){
                cur.next = l1;
                l1 = l1.next;
            }
            else{
                cur.next = l2;
                l2 = l2.next;
            }
            cur = cur.next;
        }
        if(l1 != null)
            cur.next = l1;
        if(l2 != null)
            cur.next = l2;
        return head.next;
    }

    public static void main(String[] args) {
        ListNode l1 = ListUtil.buildLinkedList(new int[]{1});
        ListNode l2 = ListUtil.buildLinkedList(new int[]{1});
        ListUtil.printList(mergeTwoLists(l1,l2));
    }
}
