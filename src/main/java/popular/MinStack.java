package popular;

import java.util.Deque;
import java.util.LinkedList;

/**
 * Easy
 * <p>
 * Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.
 * <p>
 * Implement the MinStack class:
 * <p>
 * MinStack() initializes the stack object.
 * void push(int val) pushes the element val onto the stack.
 * void pop() removes the element on the top of the stack.
 * int top() gets the top element of the stack.
 * int getMin() retrieves the minimum element in the stack.
 * Example 1:
 * <p>
 * Input
 * <p>
 * ["MinStack","push","push","push","getMin","pop","top","getMin"]
 * [[],[-2],[0],[-3],[],[],[],[]]
 * Output: [null,null,null,null,-3,null,0,-2]
 * <p>
 * Constraints:
 * <p>
 * -2^31 <= val <= 2^31 - 1
 * Methods pop, top and getMin operations will always be called on non-empty stacks.
 * At most 3 * 104 calls will be made to push, pop, top, and getMin.
 */
public class MinStack {
    private final Deque<Node> stack = new LinkedList<>();

    public void push(int x) {
        Node node;
        if (!stack.isEmpty()) {
            Node top = stack.peek();
            node = new Node(x, Math.min(top.min, x));
        } else {
            node = new Node(x, x);
        }
        stack.push(node);
    }

    public void pop() {
        stack.pop();
    }

    public int top() {
        assert stack.peek() != null;
        return stack.peek().value;
    }

    public int getMin() {
        assert stack.peek() != null;
        return stack.peek().min;
    }

    static class Node {
        int value, min;

        Node(int value, int min) {
            this.value = value;
            this.min = min;
        }
    }
}
