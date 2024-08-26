//Leetcode 22 - Generate Parathesis 
//Similar to checking the paranthesis of Leetcode problem 20
// Two types of brackets - A) Nested B) Next to each other
// Backtrack + recursive

class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> outputArray = new ArrayList();
        backTrack(outputArray, "",0,0,n);
        return outputArray;
    }

    public void backTrack(List<String> outputArray, String currentString,int open, int close, int max){
        //Some base case + decision
        if(currentString.length() == max * 2){
            outputArray.add(currentString);
            return;
        }

        //Decision handling
        if(open<max) backTrack(outputArray, currentString + "(", open+1, close, max);
        if(close<open) backTrack(outputArray, currentString + ")", open, close+1, max);

    }
}

//Approach 02 - faster

class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<String>();
        recurse(res, 0, 0, "", n);
        return res;
    }
    
    public void recurse(List<String> res, int left, int right, String s, int n) {
        if (s.length() == n * 2) {
            res.add(s);
            return;
        }
        
        if (left < n) {
            recurse(res, left + 1, right, s + "(", n);
        }
        
        if (right < left) {
            recurse(res, left, right + 1, s + ")", n);
        }
    }
}