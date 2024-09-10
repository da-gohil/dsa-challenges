class Solution {
    public int thirdMax(int[] nums) {
        
        Integer max = null;
        Integer second_max = null;
        Integer third_max = null;
        
        for (Integer num : nums) {
            // Skip if num is already one of the max values
            if (num.equals(max) || num.equals(second_max) || num.equals(third_max)) {
                continue;
            }

            // If num is greater than the current max
            if (max == null || num > max) {
                third_max = second_max;
                second_max = max;
                max = num;
            }
            // If num is greater than second_max but less than max
            else if (second_max == null || num > second_max) {
                third_max = second_max;
                second_max = num;
            }
            // If num is greater than third_max but less than second_max
            else if (third_max == null || num > third_max) {
                third_max = num;
            }
        }
        
        // If there is no third distinct max, return the maximum
        if (third_max == null) {
            return max;
        }
        
        return third_max;
    }
}
