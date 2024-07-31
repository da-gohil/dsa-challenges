// Leetcode 485 - 2 solutions
//Solution 01 - using for loop
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int currentMax = 0;

        for(int i =0; i<nums.length; i++){
            if(nums[i] == 1){
                currentMax = currentMax + 1;
                // Compare which one is the bigger one
                max = Math.max(max, currentMax);
            }else{
                currentMax = 0;
            }
        }
        return max;
    }
}

//Using for-each loop
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int currentMax = 0;

        for (int num : nums) {
            if (num == 1) {
                currentMax++;
                max = Math.max(max, currentMax);
            } else {
                currentMax = 0;
            }
        }
        return max;
    }
}
