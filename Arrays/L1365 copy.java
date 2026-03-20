//time complexity is O(n log n) and the space complexity is O(n).
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class L1365 {
    public int[] smallerNumbersThanCurrent(int[] nums) {

        // Step 1: Create a copy of the original array to preserve the original order.
        int[] originalNums = Arrays.copyOf(nums, nums.length);

        // Step 2: Sort the original array.
        Arrays.sort(nums);
        
        // Step 3: Create a HashMap to store the count of smaller numbers.
        // The key will be the number, and the value will be the count of smaller numbers.
        Map<Integer, Integer> resultMap = new HashMap<>();
        
        // Step 4: Iterate through the sorted array to populate the map.
        // The index of each number in the sorted array represents the count of smaller numbers.
        for (int i = 0; i < nums.length; i++) {
            // We only need to store the first occurrence of each number to handle duplicates correctly.
            if (!resultMap.containsKey(nums[i])) {
                resultMap.put(nums[i], i);
            }
        }
        
        // Step 5: Create the result array and populate it by looking up counts in the map.
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            // Use the original array to get the number and look up its count in the map.
            result[i] = resultMap.get(originalNums[i]);
        }
        
        return result;
    }

    public static void main(String[] args) {
        L1365 solution = new L1365();

        int[] nums1 = {8, 1, 2, 2, 3};
        int[] result1 = solution.smallerNumbersThanCurrent(nums1);
        System.out.println("Input: " + Arrays.toString(nums1));
        System.out.println("Output: " + Arrays.toString(result1)); // Expected: [4, 0, 1, 1, 3]
        System.out.println("---");

        int[] nums2 = {6, 5, 4, 8};
        int[] result2 = solution.smallerNumbersThanCurrent(nums2);
        System.out.println("Input: " + Arrays.toString(nums2));
        System.out.println("Output: " + Arrays.toString(result2)); // Expected: [2, 1, 0, 3]
    }
}