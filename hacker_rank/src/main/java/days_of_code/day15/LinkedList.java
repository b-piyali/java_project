package days_of_code.day15;

import java.util.Scanner;

public class LinkedList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        int N = sc.nextInt();

        while(N-- > 0) {
            int ele = sc.nextInt();
            head = insert(head,ele);
        }
        display(head);
        sc.close();
    }

    private static void display(Node head) {
        Node start = head;
        while(start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }
    private static Node insert(Node head,int data) {

        if (head == null) return new Node(data);
        head.next = insert(head.next, data);
        return head;
    }
 }
