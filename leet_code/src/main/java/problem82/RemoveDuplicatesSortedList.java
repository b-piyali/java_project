package problem82;

import listNode.ListNode;

import java.util.Objects;

public class RemoveDuplicatesSortedList {
    public ListNode deleteDuplicates(ListNode head) {
        if (Objects.isNull(head))
            return null;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode cur = head, pre = dummy;
        boolean flag = true;
        while (cur.next != null) {
            if (cur.next.val == cur.val) {
                pre.next = cur.next.next;
                cur = cur.next;
                flag = false;
            } else {
                if (flag) pre = pre.next;
                cur = cur.next;
                flag = true;
            }
        }
        return dummy.next;
    }
}
