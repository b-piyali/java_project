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

    static boolean compareLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        while (head1 != null && head2 != null && head1.data == head2.data) {
            head1 = head1.next;
            head2 = head2.next;
        }
        return head1 == head2;
    }

    public static int getNode(SinglyLinkedListNode llist, int positionFromTail) {
        SinglyLinkedListNode current = llist;
        SinglyLinkedListNode temp = llist;
        if (llist == null)
            return 0;
        for (int i = 0; i < positionFromTail; i++)
            temp = temp.next;

        while (temp.next != null) {
            current = current.next;
            temp = temp.next;
        }
        return current.data;
    }

    public static SinglyLinkedListNode removeDuplicates(SinglyLinkedListNode llist) {
        SinglyLinkedListNode current = llist;
        while (current.next != null) {
            if (current.next.data == current.data)
                deleteNode(current);
            else
                current = current.next;
        }
        return llist;
    }

    static SinglyLinkedListNode mergeLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
//Merge two sorted linked lists
        SinglyLinkedListNode newList = null;
        while (head1 != null || head2 != null) {
            if ((head1 != null && head2 != null && head1.data <= head2.data) || head2 == null) {
                newList = insertNodeAtTail(newList, head1.data);
                head1 = head1.next;
            } else {
                newList = insertNodeAtTail(newList, head2.data);
                head2 = head2.next;
            }
        }
        return newList;
    }

    static int findMergeNode(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
//Find Merge Point of Two Lists
        SinglyLinkedListNode currentA = head1;
        SinglyLinkedListNode currentB = head2;

        //Do till the two nodes are the same
        while (currentA != currentB) {
            //If you reached the end of one list start at the beginning of the other one
            // //currentA
            if (currentA.next == null) {
                currentA = head2;
            } else {
                currentA = currentA.next;
            }
            //currentB
            if (currentB.next == null) {
                currentB = head1;
            } else {
                currentB = currentB.next;
            }
        }
        return currentB.data;
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
