class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        Map<Integer, Integer> resultMap = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            int reqNumber = target - nums[i];

            if(resultMap.containsKey(reqNumber)){
                int [] arr = {resultMap.get(reqNumber), i};
                return arr;
            }
            resultMap.put(nums[i], i);
        }
        
        return null;
    }
}