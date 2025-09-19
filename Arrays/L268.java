class Solution {
    public int missingNumber(int[] nums) {
        if(nums.length == 0 || nums == null){
            return 0;
        }

        int n = nums.length;
        int total = n * (n + 1) / 2;
        int sum = 0;

        for(int num : nums){
            sum = sum + num;
        }
        return total - sum;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        
        int [] numbers = {1,0,3};
        int result = sol.missingNumber(numbers);

        System.out.println("Missing Number in the list is: " + res);

    }
}