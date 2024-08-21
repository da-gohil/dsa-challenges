/* L11 - Container with Most Water*/

//Given  - array of height :- length = n
// Each integer in the array is going to represent the height of a line, and we have to find the maximum area that the container can hold
// Pretty Simple, TWO POINTER APPROACH, Let's Go!

class Solution {
    public int maxArea(int[] height) {
        int leftPointer = 0;
        int rightPointer = height.length - 1;
        int maxArea = 0;

        while (leftPointer < rightPointer) {
            for (int i = 0; i < height.length; i++) {
                if(height[leftPointer] < height[rightPointer]){
                    maxArea = Math.max(maxArea, height[leftPointer] * (rightPointer - leftPointer));
                    leftPointer++;
                }else{
                    maxArea = Math.max(maxArea, height[rightPointer] * (leftPointer - rightPointer));
                    rightPointer--;
                }
            }
        }
        return maxArea;
    }
}
