package online_class.stack;

import java.util.Stack;

public class MinStack {
    private final Stack<Integer> stack = new Stack<>();
    private final Stack<Integer> MinStack = new Stack<>();

    public void push(int x) {
        if (stack.isEmpty() || MinStack.peek() > x)
            MinStack.push(x);
        else
            MinStack.push(MinStack.peek());

        stack.push(x);
    }

    public void pop() {
        if (stack.isEmpty())
            return;
        stack.pop();
        MinStack.pop();
    }

    public int top() {
        if (stack.isEmpty())
            return -1;
        return stack.peek();
    }

    public int getMin() {
        if (stack.isEmpty())
            return -1;
        return MinStack.peek();
    }
}
