package _30_day_challenge.week2.day10;

public class MinStack_2 {
    private ListNode root;

    public MinStack_2() {
        root = new ListNode(null);
    }

    public void push(int x) {
        ListNode newListNode = new ListNode(null);
        newListNode.value = x;
        if (root.next == null) {
            root.next = newListNode;
            root.next.minValue = x;
        } else {
            newListNode.next = root.next;
            newListNode.minValue = Math.min(x, root.next.minValue);
            root.next = newListNode;
        }
    }

    public void pop() {
        if (root.next != null) {
            ListNode temp = root.next;
            root.next = temp.next;
        }
    }

    public int top() {
        return root.next.value;
    }

    public int getMin() {
        return root.next.minValue;
    }
}
