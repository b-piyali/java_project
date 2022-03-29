package problem61;

import listNode.ListNode;

public class RotateList {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || k == 0) {
            return head;
        }
        ListNode lastNode = head;
        int n = 1;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
            n++;
        }
        k = n - (k % n);
        ListNode prev = head;
        for (int i = 1; i < k; i++) {
            prev = prev.next;
        }
        lastNode.next = head;
        head = prev.next;
        prev.next = null;
        return head;
    }
}
