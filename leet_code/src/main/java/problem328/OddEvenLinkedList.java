package problem328;

import java.util.Scanner;

public class OddEvenLinkedList {
    public ListNode head;
    public ListNode tail;
    //private static final Scanner scanner = new Scanner(System.in);

    public OddEvenLinkedList() {
        this.head = null;
        this.tail = null;
    }

    private ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode listNodeOdd = head;
        ListNode listNodeEven = head.next;
        ListNode evenhead = head.next;

        while (listNodeEven != null && listNodeEven.next != null) {
            listNodeOdd.next = listNodeOdd.next.next;
            listNodeEven.next = listNodeEven.next.next;

            // after updating move odd and even, to new element pointer inserted into its next
            listNodeOdd = listNodeOdd.next;
            listNodeEven = listNodeEven.next;
        }
        listNodeOdd.next = evenhead;
        return head;
    }

    static ListNode insertNodeAtTail(ListNode head, int data) {
        if (head == null)
            return new ListNode(data);
        head.next = insertNodeAtTail(head.next, data);
        return head;
    }

    static ListNode mergeNodeAtTail(ListNode head1, ListNode head2) {
        while (head2.next != null) {
            head1 = insertNodeAtTail(head1, head2.val);
            head2 = head2.next;
        }
        return head1;
    }

    private void insertNode(int nodeData) {
        ListNode node = new ListNode(nodeData);

        if (this.head == null) {
            this.head = node;
        } else {
            this.tail.next = node;
        }

        this.tail = node;
    }

    static void printLinkedList(ListNode head) {
        if (head != null) {
            System.out.println(head.val);
            printLinkedList(head.next);
        }
    }

    public static void main(String[] args) {
        OddEvenLinkedList llist = new OddEvenLinkedList();

        Scanner scanner = new Scanner(System.in);
        int llistCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < llistCount; i++) {
            int llistItem = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            llist.insertNode(llistItem);
        }
        int position = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        System.out.println("**************");
        printLinkedList(llist.head);

        ListNode llist1 = llist.oddEvenList(llist.head);
        System.out.println("**************");
        printLinkedList(llist1);

        scanner.close();
    }
}
