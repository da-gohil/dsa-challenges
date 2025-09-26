import java.util.Arrays;

class Solution {
    /**
     * Finds the number of triplets in the array that can form a valid triangle.
     * Time Complexity: O(n^2)
     * Space Complexity: O(log n) or O(n) depending on the sort implementation
     */
    public int triangleNumber(int[] nums) {
        int n = nums.length;
        if (n < 3) {
            return 0;
        }

        // 1. Sort the array. This is crucial for the O(n^2) two-pointer approach.
        Arrays.sort(nums);
        
        int count = 0;

        // 2. Fix the longest side 'c' (nums[k]).
        // We iterate k from the largest element index (n-1) down to 2.
        for (int k = n - 1; k >= 2; k--) {
            int i = 0;     // Left pointer for side 'a'
            int j = k - 1; // Right pointer for side 'b'

            // 3. Use Two Pointers (i < j < k)
            while (i < j) {
                // 4. Check the Triangle Inequality: a + b > c
                if (nums[i] + nums[j] > nums[k]) {
                    // Valid triangle found.
                    // Since nums is sorted, any element m where i <= m < j 
                    // will also satisfy nums[m] + nums[j] > nums[k].
                    // The number of such valid elements (triplets) is (j - i).
                    count += j - i;
                    
                    // Decrement j to check for smaller 'b' values, 
                    // as we've counted all valid 'a' values for the current 'b'.
                    j--;
                } else {
                    // nums[i] + nums[j] <= nums[k] (sum is too small).
                    // We need a larger sum, so we increment 'i' to get a larger 'a'.
                    i++;
                }
            }
        }
        
        return count;
    }
}