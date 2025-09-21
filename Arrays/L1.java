import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        Map<Integer, Integer> resultMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            
            int reqNumber = target - nums[i];
            
            if (resultMap.containsKey(reqNumber)) {
                int[] arr = {resultMap.get(reqNumber), i};
                return arr;
            }
            resultMap.put(nums[i], i);
        }
        return null;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        
        int[] result = sol.twoSum(nums, target);
        
        if (result != null) {
            System.out.println("The indices are: " + Arrays.toString(result));
        } else {
            System.out.println("No two numbers found that sum to the target.");
        }
    }
}