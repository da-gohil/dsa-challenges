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
            int width = rightPointer - leftPointer;
            int currentHeight = Math.min(height[leftPointer], height[rightPointer]);
            int currentArea = width * currentHeight;
            maxArea = Math.max(maxArea, currentArea);

            // Move the pointer that points to the shorter line
            if (height[leftPointer] < height[rightPointer]) {
                leftPointer++;
            } else {
                rightPointer--;
            }
        }
        return maxArea;
    }
}
