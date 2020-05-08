package _30_day_challenge.week2.day10;

/**
 * Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.
 * <p>
 * push(x) -- Push element x onto stack.
 * pop() -- Removes the element on top of the stack.
 * top() -- Get the top element.
 * getMin() -- Retrieve the minimum element in the stack.
 * <p>
 * Example:
 * MinStack minStack = new MinStack();
 * minStack.push(-2);
 * minStack.push(0);
 * minStack.push(-3);
 * minStack.getMin();   --> Returns -3.
 * minStack.pop();
 * minStack.top();      --> Returns 0.
 * minStack.getMin();   --> Returns -2.
 */

public class MinStack {
    private ListNode head;

    public MinStack() {
        head = new ListNode(null);
    }

    public void push(int x) {
        if (head == null)
            head = new ListNode(x, x);
        else
            head = new ListNode(x, Math.min(x, head.minValue), head);
    }

    public void pop() {
        if (head != null)
            head = head.next;
    }

    public int top() {
        return head.value;
    }

    public int getMin() {
        return head.minValue;
    }
}
/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
