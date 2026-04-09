import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

class Solution {
    public int[] dailyTemperatures(int[] temperatures) {

        int n = temperatures.length;
        int [] output_arr = new int[n];
        Arrays.fill(output_arr,0);
        
        Deque<Integer> stack = new ArrayDeque<>();

        for(int i=0; i<n; i++){
            while(!stack.isEmpty() && temperatures[stack.peek()] < temperatures[i]){
                output_arr[stack.peek()] = i - stack.peek();
                stack.pop();
            }
            stack.push(i);
        }
        return output_arr;
    }
}