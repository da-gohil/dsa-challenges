//Leetcode 58

class Solution {
    public int lengthOfLastWord(String s) {
        // Trim the string to remove leading and trailing spaces
        s = s.trim();
        
        // Check if the string is empty after trimming
        if (s.isEmpty()) {
            return 0;
        }
        
        // Find the last space index
        int lastSpaceIndex = s.lastIndexOf(' ');

        // If there are no spaces, the entire string is the last word
        if (lastSpaceIndex == -1) {
            return s.length();
        }

        // Return the length of the last word
        return s.length() - lastSpaceIndex - 1;
    }
}

//Approach using Delimitter 

class Solution {
    public int lengthOfLastWord(String s) {
        // Trim the string to remove leading and trailing spaces
        s = s.trim();
        
        // Split the string using space as a delimiter
        String[] words = s.split(" ");
        
        // Check if there are no words
        if (words.length == 0) {
            return 0;
        }
        
        // Return the length of the last word
        return words[words.length - 1].length();
    }
}
