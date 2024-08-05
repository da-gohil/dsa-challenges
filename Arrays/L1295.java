class Solution {
    public int findNumbers(int[] nums) {
    
    // Counter for numbers with even number of digits
    int evenDigitCount = 0;
    
        for (int number : nums) {
            // Convert number to string and check the length
            int digitCount = Integer.toString(number).length();
            if (digitCount % 2 == 0) {
                evenDigitCount++;
            }
        }
        return evenDigitCount;
    }
}