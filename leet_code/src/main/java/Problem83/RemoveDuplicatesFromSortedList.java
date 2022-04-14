package Problem83;
// created by: bandypiy
// Date: 10/16/2018

import listNode.ListNode;

public class RemoveDuplicatesFromSortedList {

    ListNode headNode = null;

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null)
            return null;

        ListNode previousNode = head;
        ListNode nextNode = head.next;
        ListNode tempNode;

        while (nextNode != null) {
            if (previousNode.val == nextNode.val) {
                previousNode.next = nextNode.next;
                tempNode = nextNode;
                nextNode = nextNode.next;
                tempNode.next = null;
            } else {
                previousNode = nextNode;
                nextNode = nextNode.next;
            }
        }
        return head;
    }

    public void add(int value) {
        ListNode newNode = new ListNode(value);
        if (headNode != null)
            newNode.next = headNode;
        headNode = newNode;
    }

    private void print() {
        for (ListNode curr = headNode; curr != null; curr = curr.next)
            System.out.println(curr.val);
        System.out.println("*********************");
    }

    public static void main(String[] args) {
        RemoveDuplicatesFromSortedList linkedList = new RemoveDuplicatesFromSortedList();
        for (int i = 0; i < 10; i++) {
            linkedList.add(i);
            linkedList.add(i);
        }
        linkedList.print();
        linkedList.deleteDuplicates(linkedList.headNode);
        linkedList.print();
    }
}
