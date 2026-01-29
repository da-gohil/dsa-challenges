// Time Complexity: O(n)
// Space Complexity: O(n)
// If Memory is extremely tight: You would use the Two-Pointer approach. You’d sort the array first, then use two pointers at each end. 
// This takes $O(n \log n)$ time but $O(1)$ space
// In 99% of web/app dev: Hash Map version is preferred because memory is usually cheaper than user wait time


import java.util.HashMap;
import java.util.Map;

class LC01TwoSum {
    public int[] twoSum(int[] nums, int target) {
        
        // Industry Practice: Initialize map with expected size to avoid rehashing
        Map<Integer, Integer> resultMap = new HashMap<>(nums.length);

        for(int i=0; i<nums.length; i++){
            int reqNumber = target - nums[i];

            if(resultMap.containsKey(reqNumber)){
                int [] arr = {resultMap.get(reqNumber), i};
                return arr;
            }
            resultMap.put(nums[i], i);
        }
        // Industry Practice: Return empty array or throw error instead of null
        throw new IllegalArgumentException("No two sum solution found");
    }
}