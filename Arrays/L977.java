
class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        
        for(int i =0; i<nums.length; i++){
            int squared = nums[i] * nums[i];
            res[i] = squared;
        }
        Arrays.sort(res);
        return res;
    }
}
