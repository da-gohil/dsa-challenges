class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        //Edge case
        if (k <= 1) return 0;
        // we will use this if we want to return the array
        //ArrayList<Integers> result = new ArrayList<Integer>();
        
        // but here we need to return the count
        int result = 0;
        
        int windowStart = 0;
        int windowProduct = 1;

        for(int windowEnd = 0; windowEnd<nums.length; windowEnd++){
            windowProduct *= nums[windowEnd];
            //If we got the result less than k, then we will add
            while (windowProduct >= k) {
                windowProduct /= nums[windowStart];
                windowStart++;
            }
            result += windowEnd - windowStart + 1;
        }
        return result;
    }
}