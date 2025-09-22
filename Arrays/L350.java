import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        // To optimize, use the smaller array for the frequency map
        if (nums1.length > nums2.length) {
            return intersect(nums2, nums1);
        }
        
        // Step 1: Count frequencies of elements in nums1
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : nums1) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        
        // Step 2: Find intersection and build result list
        List<Integer> resultList = new ArrayList<>();
        for (int num : nums2) {
            if (freqMap.getOrDefault(num, 0) > 0) {
                resultList.add(num);
                freqMap.put(num, freqMap.get(num) - 1);
            }
        }
        
        // Step 3: Convert list to array
        int[] result = new int[resultList.size()];
        int i = 0;
        for (int num : resultList) {
            result[i++] = num;
        }
        
        return result;
    }
}