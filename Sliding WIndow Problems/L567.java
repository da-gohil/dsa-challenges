//Leetcode 567 - Permutation in the String

class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n1 = s1.length();
        int n2 = s2.length();
        
        if (n1 > n2) return false; // If s1 is longer, no need to check

        // Count characters in s1
        int[] s1Count = new int[26];
        int[] s2Count = new int[26];
        
        // Count characters in the first window of s2
        for (char c : s1.toCharArray()) {
            s1Count[c - 'a']++;
        }
                
        for (int i = 0; i < n1; i++) {
            s2Count[s2.charAt(i) - 'a']++;
        }

        // Slide over s2
        for (int i = n1; i < n2; i++) {
            if (matches(s1Count, s2Count)) {
                return true;
            }
            // Update the window: add the next character, remove the first character
            s2Count[s2.charAt(i) - 'a']++;
            s2Count[s2.charAt(i - n1) - 'a']--;
        }

        // Final check for the last window
        return matches(s1Count, s2Count);
    }

    // Check if the counts match
    private boolean matches(int[] s1Count, int[] s2Count) {
        for (int i = 0; i < 26; i++) {
            if (s1Count[i] != s2Count[i]) return false;
        }
        return true;
    }
}
