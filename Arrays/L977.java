// Leetcode 971
// Approach 01 - Using Fixed size - Arrays
class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        
        // Calculate the squares of each number
        for (int i = 0; i < n; i++) {
            int square = nums[i] * nums[i];
            res[i] = square;
        }
        
        // Sort the squared numbers
        Arrays.sort(res);
        
        return res;
    }
}
// Approach 02 - Using Dyanmic size - ArrayList
import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int[] sortedSquares(int[] nums) {
        ArrayList<Integer> squaredList = new ArrayList<>();
        
        // Calculate the squares of each number
        for (int number : nums) {
            int square = number * number;
            squaredList.add(square);
        }
        
        // Sort the list
        Collections.sort(squaredList);
        
        // Convert ArrayList to int[]
        int[] squaredArray = new int[squaredList.size()];
        for (int i = 0; i < squaredList.size(); i++) {
            squaredArray[i] = squaredList.get(i);
        }
        
        return squaredArray;
    }
}