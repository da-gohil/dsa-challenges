// Leetcode 941 - Valid Mountain

class Solution {
    public boolean validMountainArray(int[] arr) {
        if (arr.length < 3) {
            return false; // A mountain array needs at least 3 elements
        }

        int i = 0;

        // Step 1: Walk up the increasing part of the array
        while (i + 1 < arr.length && arr[i] < arr[i + 1]) {
            i++;
        }

        // Step 2: Check if the peak is at the start or end (invalid mountain)
        if (i == 0 || i == arr.length - 1) {
            return false;
        }

        // Step 3: Walk down the decreasing part of the array
        while (i + 1 < arr.length && arr[i] > arr[i + 1]) {
            i++;
        }

        // Step 4: Check if we've reached the end of the array
        return i == arr.length - 1;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] arr = {0, 3, 2, 1};
        System.out.println(sol.validMountainArray(arr)); // Output: true
    }
}
