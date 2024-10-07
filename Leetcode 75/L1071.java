class Solution {
    public String gcdOfStrings(String str1, String str2) {
        // Step 1: Check if concatenation of the strings in both orders is equal
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }

        // Step 2: Find the GCD of the lengths of str1 and str2
        int gcdLength = gcd(str1.length(), str2.length());

        // Step 3: Return the substring of str1 from index 0 to gcdLength
        return str1.substring(0, gcdLength);
    }

    // Helper method to calculate the GCD of two integers
    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
