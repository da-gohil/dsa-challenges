//Leetcode 35

class Solution {
    public int searchInsert(int[] nums, int target) {
        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            // If we find the target, return its index
            if (nums[i] == target) {
                return i;
            }
            // If the current number is greater than the target,
            // return the current index as the insertion point
            if (nums[i] > target) {
                return i;
            }
        }
        // If we reach the end, the target should be inserted at the end
        return nums.length;
    }
}
