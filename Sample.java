// Time Complexity : O(1) for all operations
// Space Complexity : O(n) for storing elements in the stack
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach
import java.util.Stack;

class MinStack {
    Stack<Integer> stack = new Stack<>();
    Stack<Integer> minStack = new Stack<>();

    public MinStack() {
    }

    public void push(int x) {
        // If minStack is empty, push x as the first minimum
        int min = minStack.isEmpty() ? x : Math.min(minStack.peek(), x);
        minStack.push(min);
        stack.push(x);
    }

    public void pop() {
        stack.pop();
        minStack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }

    public static void main(String[] args) {
        MinStack minStack = new MinStack();

        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);

        System.out.println("Minimum element in the stack: " + minStack.getMin()); // Output should be -3

        minStack.pop();

        System.out.println("Top element in the stack: " + minStack.top()); // Output should be 0

        System.out.println("Minimum element in the stack: " + minStack.getMin()); // Output should be -2
    }
}
