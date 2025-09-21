class L268{
    public int missingNumber(int[] nums) {
        if (nums == null) {
            // Handle the case where the input array reference is null
            throw new IllegalArgumentException("Input array cannot be null.");
        }

        int n = nums.length;
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;

        for (int num : nums) {
            actualSum += num;
        }

        return expectedSum - actualSum;
    }

    public static void main(String[] args) {
        L268 sol = new L268();

        int[] numbers = {2};
        int result = sol.missingNumber(numbers);

        System.out.println("Missing Number in the list is: " + result);
    }
}