class Solution {
    /**
     * Finds the missing number in an array of distinct numbers
     * taken from the range [0, n].
     *
     * @param nums The input array containing n distinct numbers.
     * @return The single missing number.
     */
    
    public int missingNumber(int[] nums) {
        // --- Step 1: Handle Edge Cases ---
        // Although problem constraints usually ensure a non-empty array,
        // this check is good practice for robustness.
        if (nums == null || nums.length == 0) {
            return 0;
        }

        // --- Step 2: Calculate the Expected Sum ---
        // The array is supposed to contain numbers from 0 to n.
        // We first find 'n', which is the length of the array.
        int n = nums.length;
        
        // Use the mathematical formula for the sum of the first n integers:
        // Sum = n * (n + 1) / 2
        // This gives us the total sum we would expect if all numbers were present.
        int expectedSum = n * (n + 1) / 2;

        // --- Step 3: Calculate the Actual Sum ---
        // Initialize a variable to hold the sum of the numbers in the array.
        int actualSum = 0;
        
        // Loop through each number in the array and add it to the sum.
        for (int num : nums) {
            actualSum += num;
        }

        // --- Step 4: Find the Difference ---
        // The difference between the expected sum and the actual sum
        // will be the missing number.
        // For example, if expectedSum = 10 (0+1+2+3+4) and actualSum = 6 (0+1+3+2),
        // then the missing number is 10 - 6 = 4.
        return expectedSum - actualSum;
    }

    public static void main(String[] args) {
        // Create an instance of the Solution class to call the method.
        Solution sol = new Solution();

        // Define a sample array with a missing number.
        int[] numbers = {3, 0, 1}; // The number 2 is missing.
        
        // Call the missingNumber method and store the result.
        int result = sol.missingNumber(numbers);

        // Print the result to the console.
        System.out.println("Missing Number in the list is: " + result);
    }
}