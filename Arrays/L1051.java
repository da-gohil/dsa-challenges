//Leetcode 1051 - Sorted array
class Solution {
    public int heightChecker(int[] heights) {
        int[] sortedHeights = height.clone();
        Arrays.sort(sortedHeights);

        int res =0;

        for(int i=0; i<heights.length;i++){
            if(sortedHeights[i] != heights[i]){
                res+=1;
            }
        }
        return res;
    }
}
