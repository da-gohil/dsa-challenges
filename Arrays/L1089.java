class Solution {
    public void duplicateZeros(int[] arr) {
        int zeros = 0;
        int length = arr.length - 1;
        
        // Step 1: Count the number of zeros that will be duplicated
        for (int i = 0; i <= length - zeros; i++) {
            if (arr[i] == 0) {
                // Edge case: if adding a zero would push the last element out of bounds
                if (i == length - zeros) {
                    arr[length] = 0; // Move the zero to the end
                    length--; // Reduce the length since the last zero can't be duplicated
                    break;
                }
                zeros++;
            }
        }
        
        // Step 2: Traverse the array from the end, shifting elements to the right
        for (int i = length - zeros; i >= 0; i--) {
            if (arr[i] == 0) {
                arr[i + zeros] = 0;
                zeros--;
                arr[i + zeros] = 0;
            } else {
                arr[i + zeros] = arr[i];
            }
        }
    }
}
