package problem206;

import listNode.ListNode;

public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        ListNode outPutNode = null;
        while (head != null) {
            ListNode nextElement = head.next;
            head.next = outPutNode;
            outPutNode = head;
            head = nextElement;
        }

        return outPutNode;
    }

}
