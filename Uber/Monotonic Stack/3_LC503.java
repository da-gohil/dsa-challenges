
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int [] output_arr = new int[n];

        Arrays.fill(output_arr, -1);
        Deque <Integer> stack = new ArrayDeque<>();
        
        for(int i=0; i < (n*2); i++){
            while(!stack.isEmpty() && nums[stack.peek()] < nums[i%n]){
                output_arr[stack.pop()] = nums[i%n];
            }
            if(i < n) stack.push(i);
        }
        return output_arr;
    }
}