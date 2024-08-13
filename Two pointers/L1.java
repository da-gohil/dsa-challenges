class Solution {

    public static int[] twoSum(int[] nums, int target) {
        
        //Key: A number from the array.
        //Value: The index of that number in the array.

        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();

        // Traverse through all the elements of the array
        for (int i = 0; i < nums.length; i++) {
            int req_num = target - nums[i];

            //retrieve its index (hm.get(req_num)) and pair it with the current index i to form the result array

            if (hm.containsKey(req_num)) {
                int[] res = { hm.get(req_num), i };
                return res;
            }
            hm.put(nums[i], i);
        }
        return null;
    }
}