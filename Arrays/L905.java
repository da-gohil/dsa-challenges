class Solution {
    public int[] sortArrayByParity(int[] nums) {

        // Null check
        if (nums == null || nums.length == 0) {
            return new int[0];  // Return an empty array if input is null or empty
        }

        int count = 0;          // Pointer for even numbers (starting at the front)
        int length = nums.length - 1;  // Pointer for odd numbers (starting at the end)

        // Parse through the array
        while (count < length) {
            if (nums[count] % 2 == 0) {
                count++;  // If the number at 'count' is even, just move the pointer
            } else {
                // If the number at 'count' is odd, swap it with the number at 'length'
                int temp = nums[count];
                nums[count] = nums[length];
                nums[length] = temp;
                length--;  // Move the 'length' pointer leftwards (since we know it's odd now)
            }
        }

        return nums;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {3, 1, 2, 4};
        int[] sorted = sol.sortArrayByParity(nums);
        for (int num : sorted) {
            System.out.print(num + " ");
        }
    }
}
