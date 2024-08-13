//Two pointer approach, simple and easy to implement

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;
        
        while (left < right) {
            int sum = numbers[left] + numbers[right];
            
            if (sum == target) {
                // Adjust for 1-based indexing if needed
                return new int[] {left + 1, right + 1};
            } else if (sum < target) {
                left++; // Move left pointer to the right to increase the sum
            } else {
                right--; // Move right pointer to the left to decrease the sum
            }
        }
        
        // If no solution is found
        return new int[0];
    }
}
