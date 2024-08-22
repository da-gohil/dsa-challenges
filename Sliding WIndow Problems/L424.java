// Sliding Window Problem
// Leetcode 424 - Longest Repeating Character Replacement

class Solution {
    public int characterReplacement(String s, int k) {

        int windowStart = 0;
        int maxLength = 0;
        int maxCount = 0;
        int[] charCounts = new int[26];

        for (int windowEnd = 0; windowEnd < s.length(); windowEnd++) {
            maxCount = Math.max(maxCount, ++charCounts[s.charAt(windowEnd) - 'A']);

            // Check if the window is valid
            if (windowEnd - windowStart + 1 - maxCount > k) {
                charCounts[s.charAt(windowStart) - 'A']--;
                windowStart++;
            }

            maxLength = Math.max(maxLength, windowEnd - windowStart + 1);
        }
        
        return maxLength;
    }
}
