// Leetcode - Neetcode series - 150
// Arrays Problem 01
// Darshan Gohil

class Solution {
    public boolean containsDuplicate(int[] nums) {
        // Initialize the HashSet
        HashSet<Integer> hashset = new HashSet<>();

        // Iterate through each number in the array
        for (int n : nums) {
            // Check if the number is already in the HashSet
            if (hashset.contains(n)) {
                return true; // Duplicate found
            }
            // Add the number to the HashSet
            hashset.add(n);
        }
        
        // No duplicates found
        return false;
    }
}
