//Leetcode 20 - Valid Parenthesis

import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        // If the length is odd, it cannot be valid
        if(s.length() % 2 != 0) return false;

        Stack<Character> stack = new Stack<>();
        
        // Parsing through each element
        for(char c : s.toCharArray()){
            if(c == '(' || c == '{' || c == '['){
                stack.push(c);
            }else if(c == ')' && !stack.isEmpty() && stack.peek() == '('){
                stack.pop();
            }else if(c == '}' && !stack.isEmpty() && stack.peek() == '{'){
                stack.pop();
            }else if(c == ']' && !stack.isEmpty() && stack.peek() == '['){
                stack.pop();
            } else {
                // If an unmatched closing bracket is found, return false
                return false;
            }
        }
        
        // If the stack is empty, all brackets were matched correctly
        return stack.isEmpty();
    }
}
