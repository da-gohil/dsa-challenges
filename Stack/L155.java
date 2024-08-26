// Leetcode 155 stack implementation and operations in constant time

import java.util.Stack;

class MinStack {
    private Stack<Integer>stack;
    private Stack<Integer>minStack;
    
    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }
    
    public void push(int val) {
        stack.push(val);
         // Push the minimum element onto minStack
         if (minStack.isEmpty() || val <= minStack.peek()) {
            minStack.push(val);
        }
    }
    
    public void pop() {
        int poppedElement = stack.pop();
        // If the popped element is the minimum, pop it from minStack as well
        if (poppedElement == minStack.peek()) {
            minStack.pop();
        }
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return minStack.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */