// Deletion from an array - we decrement the length operator -> length--;
// Insertion - we add and increment the length operator 
//3 Types
// Deleting the last element of the Array.
// Deleting the first element of the Array -> The most costliest operation in arrays
// Deletion at any given index.

// Leetcode 27. Remove Element
import java.util.Arrays;
class Solution {
    public int removeElement(int[] nums, int val) {
        int count = 0;
        // Remove all the val in place
        for(int i=0; i<nums.length; i++){
            if(nums[i] != val){
                nums[count] = nums[i];
                count++;
            }
        }
        //return number of elements that are not equals to val
        return count;
    }

    public static void main(String args[]){
        //Insertion Demo
        /*int[] nums = new int[5];    
        for(int i=0; i<nums.length; i++){
            nums[i] = i;
        }
        System.out.println("Array: " + Arrays.toString(nums));
        */

        //Solution implementation
        int[] nums = {0,1,2,2,3,0,4,2};
        int val = 2;

        Solution sol = new Solution();
        int newLength = sol.removeElement(nums, val);

        System.out.println("New length of the array: " + newLength);

    }
}