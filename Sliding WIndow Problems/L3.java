
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int windowStart = 0;
        int windowEnd = 0;
        int maxLength = 0;

        HashSet<Character> set = new HashSet<>();

        while (windowEnd < s.length()) {
            // If set doesn't contain that character, add it to the set and update maxLength
            if (!set.contains(s.charAt(windowEnd))) {
                set.add(s.charAt(windowEnd));
                windowEnd++;
                maxLength = Math.max(maxLength, set.size());
            }   
            // If the set already contains the character, remove the character at windowStart
            else {
                set.remove(s.charAt(windowStart));
                windowStart++;
            }
        }
        return maxLength;
    }
}
