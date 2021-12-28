package problem876;

public class MiddleLinkedList {
    public ListNode middleNode(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode middleNode = head;
        ListNode tailNode = head;
        while (tailNode != null && tailNode.next != null) {
            middleNode = middleNode.next;
            tailNode = tailNode.next.next;
        }
        return middleNode;
    }
}
