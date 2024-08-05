// Leetcode 03 - Sliding WIndow Problem
import java.util.ArrayList;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int start = 0;
        int end = 0;
        int maxLength = 0;

        ArrayList<Character> list = new ArrayList<Character>();

        while (end < s.length()) {
            // If list doesn't contain that character then only we add that character
            if (!list.contains(s.charAt(end))) {
                list.add(s.charAt(end));
                end++;
                maxLength = Math.max(maxLength, list.size());
            }   
            // If we already have that character then we need to remove it
            else {
                // If we do not write valueOf, we will get ASCII value of the character and error will be thrown
                list.remove(Character.valueOf(s.charAt(start)));
                // After removing, we will update the start to one ahead of the window
                start++;
            }
        }

        return maxLength;
    }
}