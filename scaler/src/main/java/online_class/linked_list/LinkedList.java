package online_class.linked_list;

public class LinkedList {
    private static Node head = null;
    private static int length = 0;

    static class Node {
        Node nextNode;
        int val;

        Node(int val) {
            this.val = val;
            this.nextNode = null;
        }
    }

    public static void insert_node(int position, int value) {
        if (position > length + 1) {
            return;
        }
        if (head == null) {
            head = new Node(value);
        } else {
            int count = 1;
            Node curNode = head;
            while (curNode != null) {
                count++;
                if (position == count) {
                    Node newNode = new Node(value);
                    newNode.nextNode = curNode.nextNode;
                    curNode.nextNode = newNode;
                    break;
                }
                curNode = curNode.nextNode;
            }
        }
        length++;
    }

    public static void delete_node(int position) {
        if (position > length) {
            return;
        }
        if (head != null) {
            if (position == 1 || head.nextNode == null) {
                head = head.nextNode;
            } else {
                int count = 1;
                Node curNode = head;
                while (curNode.nextNode != null) {
                    count++;
                    if (position == count) {
                        curNode.nextNode = curNode.nextNode.nextNode;
                        break;
                    }
                    curNode = curNode.nextNode;
                }
            }
            length--;
        }
    }

    public static void print_ll() {
        if (length == 0) {
            return;
        }
        Node node = head;
        while (node.nextNode != null) {
            System.out.print(node.val + " ");
            node = node.nextNode;
        }
        System.out.print(node.val);
    }
}
