// Finding winner of the circular game
// similar to passing the parcel game

class Solution {
    public int solve(int n, int k) {
        if(n == 1){
            return 0;
        }
        return (solve(n-1,k) + k) % n;
    }
    public int findTheWinner(int n, int k) {
        int ans = solve(n,k) + 1;
        return ans;
    }
}