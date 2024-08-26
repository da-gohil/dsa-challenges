// Leetcode 150 - Reverse Polish Notation
// Post-fix, In-fix, Pre-Infix
// This particular is of POST-FIX 
import java.util.Stack;

class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        
        // Iterate through each token
        for (String token : tokens) {
            if (token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")) {
                // Pop two operands from the stack
                int b = stack.pop();
                int a = stack.pop();
                
                // Perform the operation and push the result back onto the stack
                switch (token) {
                    case "+":
                        stack.push(a + b);
                        break;
                    case "-":
                        stack.push(a - b);
                        break;
                    case "*":
                        stack.push(a * b);
                        break;
                    case "/":
                        stack.push(a / b); // Integer division
                        break;
                }
            } else {
                // Token is an operand, push it onto the stack
                stack.push(Integer.parseInt(token));
            }
        }
        // The result is the only element left in the stack
        return stack.pop();
    }
}
