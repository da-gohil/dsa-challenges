// L242 - Anagrams or not
// Time complexity - O(s+t)
// Space complexity - O(s+t)

class Solution {
    public boolean isAnagram(String s, String t) {
        // If the lengths of the strings are different, they cannot be anagrams
        if (s.length() != t.length()) {
            return false;
        }

        // Create HashMaps to count the frequency of each character
        Map<Character, Integer> countS = new HashMap<>();
        Map<Character, Integer> countT = new HashMap<>();

        // Count the frequency of each character in both strings
        for (int i = 0; i < s.length(); i++) {
            countS.put(s.charAt(i), countS.getOrDefault(s.charAt(i), 0) + 1);
            countT.put(t.charAt(i), countT.getOrDefault(t.charAt(i), 0) + 1);
        }

        // Compare the frequency maps
        for (char c : countS.keySet()) {
            if (!countS.get(c).equals(countT.getOrDefault(c, 0))) {
                return false;
            }
        }
        return true;
    }
}
