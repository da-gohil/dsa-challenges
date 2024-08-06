class Solution {
    public int findLHS(int[] nums) {
        
        // Step 1: Sort the array
        Arrays.sort(nums); 

        //Sliding window initializer variables
        int windowStart = 0;
        int windowMaxLength = 0;

        // Step 2: Use two pointers to create a sliding window
        for (int windowEnd = 0; windowEnd < nums.length; windowEnd++) {
            // Shrink the window until the difference is at most 1
            while (nums[windowEnd] - nums[windowStart] > 1) {
                windowStart++;
            }
            // If the difference is exactly 1, update the max length
            if (nums[windowEnd] - nums[windowStart] == 1) {
                windowMaxLength = Math.max(windowMaxLength, windowEnd - windowStart + 1);
            }
        }
        return windowMaxLength;
    }
}