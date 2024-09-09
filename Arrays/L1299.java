// Leetcode 1299 - inplace array operations

class Solution {
    public int[] replaceElements(int[] arr) {
        int greatest = -1;

        // Traverse the array from the last element to the first
        for (int i = arr.length - 1; i >= 0; i--) {
            int current = arr[i]; // Store the current element
            arr[i] = greatest; // Replace the current element with the greatest so far
            greatest = Math.max(greatest, current); // Update the greatest element
        }
        return arr;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] arr = {17, 18, 5, 4, 6, 1};
        int[] result = sol.replaceElements(arr);

        for (int num : result) {
            System.out.print(num + " ");  // Output: 18 6 6 6 1 -1
        }
    }
}