// Post-fix, In-fix, Pre-Infix
// This particular is of IN-FIX 
// Infix notation is the standard arithmetic notation we use (e.g., 3 + 4).
// To evaluate infix expressions, you can use the Shunting-yard algorithm to convert the infix expression to postfix 
// and then evaluate it. Another approach is to use two stacks: one for operators and one for operands.

import java.util.Stack;

class InfixEvaluation {
    public int evaluateInfix(String s) {
        Stack<Integer> operands = new Stack<>();
        Stack<Character> operators = new Stack<>();
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            // If it's a digit, parse the number and push it onto the operand stack
            if (Character.isDigit(c)) {
                int num = 0;
                while (i < s.length() && Character.isDigit(s.charAt(i))) {
                    num = num * 10 + (s.charAt(i) - '0');
                    i++;
                }
                i--;
                operands.push(num);
            }
            // If it's an opening bracket, push it onto the operator stack
            else if (c == '(') {
                operators.push(c);
            }
            // If it's a closing bracket, solve the entire bracket
            else if (c == ')') {
                while (operators.peek() != '(') {
                    operands.push(applyOperation(operators.pop(), operands.pop(), operands.pop()));
                }
                operators.pop(); // Pop the opening bracket
            }
            // If it's an operator
            else if (c == '+' || c == '-' || c == '*' || c == '/') {
                // While the precedence of the current operator is less than the precedence of the top of the stack,
                // or the top of the stack is a left-associative operator of equal precedence, apply the operator.
                while (!operators.isEmpty() && precedence(c) <= precedence(operators.peek())) {
                    operands.push(applyOperation(operators.pop(), operands.pop(), operands.pop()));
                }
                operators.push(c);
            }
        }
        
        // Apply the remaining operators
        while (!operators.isEmpty()) {
            operands.push(applyOperation(operators.pop(), operands.pop(), operands.pop()));
        }
        
        return operands.pop();
    }
    
    private int applyOperation(char operator, int b, int a) {
        switch (operator) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                return a / b;
            default:
                return 0;
        }
    }
    
    private int precedence(char operator) {
        switch (operator) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            default:
                return -1;
        }
    }
}
