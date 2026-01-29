class Solution {
    /**
     * Finds the minimum number of times string A must be repeated so that B is a substring of it.
     * * @param a The string to be repeated.
     * @param b The target substring.
     * @return The minimum number of repetitions, or -1 if impossible.
     */
    public int repeatedStringMatch(String a, String b) {
        int lenA = a.length();
        int lenB = b.length();

        // 1. Calculate the minimum number of repetitions (k) needed.
        // This is equivalent to Math.ceil(lenB / lenA).
        int minRepeats = (lenB + lenA - 1) / lenA; 

        // 2. Build the string 's' with the minimum required repetitions (k).
        // Using a StringBuilder is more efficient than repeated String concatenation.
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < minRepeats; i++) {
            s.append(a);
        }
        
        // Convert to String for the substring check (or use the String version of 'a')
        String repeatedA = s.toString();

        // --- Check Attempt 1: minRepeats (k) ---
        // The repeated string is at least as long as B.
        if (repeatedA.contains(b)) {
            return minRepeats;
        }

        // --- Check Attempt 2: minRepeats + 1 (k + 1) ---
        // If B is not found, we append one more copy of A. This covers cases 
        // where B starts near the end of one A and ends in the middle of another.
        repeatedA += a; // Note: We can reuse the existing StringBuilder and append(a)
        
        if (repeatedA.contains(b)) {
            return minRepeats + 1;
        }

        // --- Final Case ---
        // If B is not found even with k+1 repetitions, it's impossible.
        return -1;
    }
}