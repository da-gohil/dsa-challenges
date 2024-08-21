// Trapping rain water - Hard 
// Leetcode 42
// width of each bar is 1

class Solution {
    public int trap(int[] height) {
        // Initialize pointers and variables to track maximum heights
        int leftPointer = 0, rightPointer = height.length - 1;
        int lMax = 0, rMax = 0;

        int totalVolume = 0;
        // Iterate while pointers do not cross each other
        while (leftPointer <= rightPointer) { // Change to <= to cover cases where pointers meet
            // Compare heights at the two pointers
            if (height[leftPointer] < height[rightPointer]) {
                // Update left maximum height
                if (height[leftPointer] >= lMax) {
                    lMax = height[leftPointer];
                } else {
                    // Calculate trapped water and add to total volume
                    totalVolume += lMax - height[leftPointer];
                }
                // Move the left pointer to the right
                leftPointer++;
            } else {
                // Update right maximum height
                if (height[rightPointer] >= rMax) {
                    rMax = height[rightPointer];
                } else {
                    // Calculate trapped water and add to total volume
                    totalVolume += rMax - height[rightPointer];
                }
                // Move the right pointer to the left
                rightPointer--;
            }
        }

        return totalVolume;
    }
}
