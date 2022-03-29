package problem21;

import listNode.ListNode;

public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode headNode = null;
        ListNode tailNode = null;
        ListNode newNode = null;
        while(l1 != null || l2 != null){
            if(l1!=null && l2!=null && l1.val <= l2.val){
                newNode = new ListNode(l1.val);
                l1 = l1.next;
            }else if(l2!=null){
                newNode = new ListNode(l2.val);
                l2 = l2.next;
            }
            if(tailNode !=null ){
                tailNode.next = newNode;
                tailNode = newNode;
            }else{
                tailNode = newNode;
                headNode = tailNode;
            }
        }
        return headNode;
    }
}
