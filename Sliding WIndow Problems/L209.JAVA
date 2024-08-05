// Leetcode 209 - SLIDING WINDOW PROBLEM
// Minimum Size Subarray Sum

class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int windowStart = 0;
        int windowSum = 0;
        int minLength = Integer.MAX_VALUE;

        for (int windowEnd = 0; windowEnd < nums.length; windowEnd++) {
            windowSum += nums[windowEnd]; // Add the current element to the window's sum

            // Shrink the window as long as the window's sum is greater than or equal to the target
            while (windowSum >= target) {
                minLength = Math.min(minLength, windowEnd - windowStart + 1); // Update the minimum length
                windowSum -= nums[windowStart]; // Remove the element at the start of the window
                windowStart++; // Slide the window to the right
            }
        }

        // If minLength is still Integer.MAX_VALUE, it means no such subarray was found
        return (minLength == Integer.MAX_VALUE) ? 0 : minLength;
    }

}
