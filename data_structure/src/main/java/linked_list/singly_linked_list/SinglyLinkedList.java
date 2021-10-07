package linked_list.singly_linked_list;

import java.util.Scanner;

public class SinglyLinkedList {
    public SinglyLinkedListNode head;
    public SinglyLinkedListNode tail;
    private static final Scanner scanner = new Scanner(System.in);

    public SinglyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void insertNode(int nodeData) {
        SinglyLinkedListNode node = new SinglyLinkedListNode(nodeData);

        if (this.head == null) {
            this.head = node;
        } else {
            this.tail.next = node;
        }

        this.tail = node;
    }

    static void printLinkedList(SinglyLinkedListNode head) {
        if (head != null) {
            System.out.println(head.data);
            printLinkedList(head.next);
        }
    }

    static SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head, int data) {
        if (head == null)
            return new SinglyLinkedListNode(data);
        head.next = insertNodeAtTail(head.next, data);
        return head;
    }

    static SinglyLinkedListNode insertNodeAtHead(SinglyLinkedListNode llist, int data) {
        SinglyLinkedListNode head = new SinglyLinkedListNode(data);
        head.next = llist;
        return head;
    }

    public static SinglyLinkedListNode deleteNode(SinglyLinkedListNode llist, int position) {
        SinglyLinkedListNode current = llist;
        int count = 0;
        if (position == 0) {
            current = llist.next;
            llist.next = null;
            return current;
        } else {
            while (current.next != null) {
                count++;
                if (count == position) {
                    deleteNode(current);
                    break;
                }
                current = current.next;
            }
        }
        return llist;
    }

    private static void deleteNode(SinglyLinkedListNode node) {
        SinglyLinkedListNode deleteNode = node.next;
        node.next = node.next.next;
        deleteNode.next = null;
    }

    public static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode llist, int data, int position) {
        SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);
        SinglyLinkedListNode current = llist;
        int count = 0;
        while (current.next != null) {
            count++;
            if (count == position) {
                newNode.next = current.next;
                current.next = newNode;
                break;
            }
            current = current.next;
        }
        return llist;
    }

    public static void reversePrint(SinglyLinkedListNode llist) {
        // Write your code here
        printLinkedList(reverse(llist));
    }

    public static SinglyLinkedListNode reverse(SinglyLinkedListNode llist) {
        SinglyLinkedListNode previous = null;
        while (llist != null) {
            SinglyLinkedListNode nextElement = llist.next;
            llist.next = previous;
            previous = llist;
            llist = nextElement;
        }
        return previous;
    }

    public static void main(String[] args) {
        SinglyLinkedList llist = new SinglyLinkedList();

        int llistCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < llistCount; i++) {
            int llistItem = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            llist.insertNode(llistItem);
        }
        int position = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        SinglyLinkedListNode llist1 = deleteNode(llist.head, position);
        printLinkedList(llist.head);

        scanner.close();
    }
}
