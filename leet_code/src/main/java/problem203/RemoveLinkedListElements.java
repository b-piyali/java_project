package problem203;

import listNode.ListNode;

import java.util.Objects;

public class RemoveLinkedListElements {
    public ListNode removeElements(ListNode head, int val) {
        if (Objects.isNull(head))
            return head;

        ListNode dummy = new ListNode(0);
        ListNode current = head;
        dummy.next = current;

        while (current.next != null) {
            if (current.next.val == val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        return dummy.next;
    }
}
