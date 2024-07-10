//L1701 - Restaurant Problem
// Time Complexity - O(n), Space Complexity - O(1)
class Solution {
    public double averageWaitingTime(int[][] customers) {
        
        int idleTime = 1;
        long totalWaitTime = 0;
        double n = customers.length;

        for (int[] customer : customers) {
        //Chef is available for cooking          
            int arrivalTime = customer[0];
            int cookTime = customer[1];

            if (idleTime < arrivalTime) {
                idleTime = arrivalTime + cookTime;
            }//If chef is preparing order of someone
            else{
                idleTime = idleTime + cookTime;
            }

            totalWaitTime = totalWaitTime + (idleTime - arrivalTime);
        }
        double avg = (totalWaitTime / n);
        return avg;
    }
}