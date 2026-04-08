import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        
        // Created a Map to store all the elements for optimal lookup with nums1
        Map <Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        Deque<Integer> stack = new ArrayDeque();
        
        for(Integer num : nums2){
            while(!stack.isEmpty() && stack.peek() < num){
                hashMap.put(stack.pop(), num);
            }
            stack.push(num);
        }

        for(int i=0; i<nums1.length; i++){
            nums1[i] = hashMap.getOrDefault(nums1[i], -1);
        }
        return nums1;
    }
}