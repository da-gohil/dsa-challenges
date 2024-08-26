// Leetcode 150 - Reverse Polish Notation
// Post-fix, In-fix, Pre-Infix
// This particular is of PRE-FIX 
// In prefix notation, the operator comes before its operands. To evaluate a prefix expression
// you can iterate from right to left, using a stack to evaluate the expression

import java.util.Stack;

class PrefixEvaluation {
    public int evaluatePrefix(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        
        // Iterate through the tokens from right to left
        for (int i = tokens.length - 1; i >= 0; i--) {
            String token = tokens[i];
            
            if (token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")) {
                // Pop two operands from the stack
                int a = stack.pop();
                int b = stack.pop();
                
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
