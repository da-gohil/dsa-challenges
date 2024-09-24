//Leetcode 28 - Index of first occurrence

class Solution {
    public int strStr(String haystack, String needle) {
        // Edge case: If needle is an empty string, return 0
        if (needle.isEmpty()) {
            return 0;
        }

        // Loop through the haystack, but stop when the remaining length is less than needle length
        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            // Check if the substring from the current index matches the needle
            if (haystack.substring(i, i + needle.length()).equals(needle)) {
                return i; // Return the index of the first occurrence
            }
        }

        // If no match is found, return -1
        return -1;
    }
}
