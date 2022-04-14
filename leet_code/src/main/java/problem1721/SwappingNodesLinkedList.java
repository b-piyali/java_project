package problem1721;

import listNode.ListNode;

public class SwappingNodesLinkedList {
    public ListNode swapNodes(ListNode head, int k) {
        ListNode firstNode;
        ListNode p = head;
        while (--k != 0)
            p = p.next;

        firstNode = p;
        ListNode secondNode = head;
        while (p.next != null) {
            p = p.next;
            secondNode = secondNode.next;
        }

        // swap
        int d = firstNode.val;
        firstNode.val = secondNode.val;
        secondNode.val = d;

        return head;
    }
}
