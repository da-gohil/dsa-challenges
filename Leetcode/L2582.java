// Leetcode 2582 - Pass The Pillow 
// Time Complexity: 𝑂(1); Space Complexity: 𝑂(1)

class Solution {
    public int passThePillow(int n, int time) {
        int numOfRounds = time / (n - 1);
        boolean revDirection = (numOfRounds % 2 != 0);

        if (revDirection) {
            return n - (time % (n - 1));
        } else {
            return time % (n - 1) + 1;
        }
    }
}
