// Leetcode 643 - Finding Average SubArray
// Input: nums = [1,12,-5,-6,50,3], k = 4
// Output: 12.75000
// Approach 01
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        //
        ArrayList<Integers> Averages = new ArrayList<Integer>();
        int windowStart = 0;
        int windowSum = 0;

        for(int windowEnd = 0; windowEnd < k; windowEnd++){
            windowSum += nums[windowEnd];

            if(windowSum >= k-1){
                //Add the average of the current window to averages array
                Averages.add(windowSum/k);
                //Subtract the integer at the windowStart from windowSum
                windowSum -= nums[windowStart];
                //Move the window one step ahead
                windowStart;
            }
        }
        return Averages;
    }
}

//Approach 02 - using Collections
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        List<Double> results = new ArrayList<>();
        double windowSum=0;
        int windowStart=0;

        for (int windowEnd = 0; windowEnd < nums.length; windowEnd++) {
            windowSum += nums[windowEnd];

            if (windowEnd >= k-1) {
                results.add(windowSum/k);

                //subtracting the element going out
                windowSum -= nums[windowStart];
                
                //then sliding the window forward
                windowStart++;
            }
        }
        Double maxResult = Collections.max(results);
        return maxResult;
    }
}