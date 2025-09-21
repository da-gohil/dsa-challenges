import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class L15 {
    public List<List<Integer>> threeSum(int[] nums) {

        // Step 1: Sort the array to efficiently handle duplicates and use the two-pointer approach.
        Arrays.sort(nums);
        
        // Step 2: Create a list to store the final unique triplets.
        List<List<Integer>> outputArray = new LinkedList<>();

        // Step 3: Iterate through the array, fixing the first element of the triplet.
        // We only need to go up to nums.length - 2 because we need at least two elements
        // for the two-pointer approach.
        for (int i = 0; i < nums.length - 2; i++) {

            // Skip duplicate elements for the fixed number to ensure unique triplets.
            // This condition checks if the current element is the same as the previous one,
            // but only after the first element (i > 0).
            if (i == 0 || (i > 0 && nums[i] != nums[i-1])) {

                // Step 4: Initialize two pointers for the rest of the array.
                int leftPointer = i + 1;
                int rightPointer = nums.length - 1;
                int sum = 0 - nums[i]; // The target for the two pointers.

                // Step 5: Use a while loop to find the remaining two numbers.
                while (leftPointer < rightPointer) {
                    
                    // Case A: Found a triplet that sums to zero.
                    if (nums[leftPointer] + nums[rightPointer] == sum) {
                        outputArray.add(Arrays.asList(nums[i], nums[leftPointer], nums[rightPointer]));
                        
                        // Skip duplicate elements for the left and right pointers.
                        while (leftPointer < rightPointer && nums[leftPointer] == nums[leftPointer + 1]) {
                            leftPointer++;
                        }
                        
                        while (leftPointer < rightPointer && nums[rightPointer] == nums[rightPointer - 1]) {
                            rightPointer--;
                        }

                        // Move pointers to find other potential solutions.
                        leftPointer++;
                        rightPointer--;
                    
                    // Case B: The sum is too large, so decrease the sum by moving the right pointer inward.
                    } else if (nums[leftPointer] + nums[rightPointer] > sum) {
                        rightPointer--;
                    
                    // Case C: The sum is too small, so increase the sum by moving the left pointer inward.
                    } else {
                        leftPointer++;
                    }
                }
            }
        }
        return outputArray;
    }

    public static void main(String[] args) {
        L15 sol = new L15();

        // TC 1
        int[] nums1 = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> result1 = sol.threeSum(nums1);
        System.out.println("Input: " + Arrays.toString(nums1));
        System.out.println("Output: " + result1);
        System.out.println("---");

        // TC 2
        int[] nums2 = {0, 1, 1};
        List<List<Integer>> result2 = sol.threeSum(nums2);
        System.out.println("Input: " + Arrays.toString(nums2));
        System.out.println("Output: " + result2);
        System.out.println("---");
        
        // TC 3
        int[] nums3 = {0, 0, 0};
        List<List<Integer>> result3 = sol.threeSum(nums3);
        System.out.println("Input: " + Arrays.toString(nums3));
        System.out.println("Output: " + result3);
    }
}