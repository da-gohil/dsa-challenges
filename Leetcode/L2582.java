// Leetcode 2582 - Pass The Pillow 

class Solution {
    public int passThePillow(int n, int time) {
        int numOfRounds = time / (time - 1);
        boolean revDirection = (numOfRounds % 2 != 0);

        if(revDirection){
            return n - (time % (n-1)); 
        }else{
            return time % (n-1) + 1;
        }
    }
}