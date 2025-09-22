import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map; // Added missing import

public class L1636 {
    
    public int[] frequencySort(int[] nums) {
    
        // Correct Step 1: Count the frequency of all elements.
        // Use getOrDefault to handle new and existing keys correctly.
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for(int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Correct Step 2: Create a List of unique numbers from the map's keys.
        List<Integer> list = new ArrayList<>(frequencyMap.keySet());
        
        // Correct Step 3: Sort the list using a custom Comparator.
        Collections.sort(list, (a, b) -> {
            // Compare frequencies first
            if(frequencyMap.get(a).intValue() != frequencyMap.get(b).intValue()) {
                return frequencyMap.get(a).intValue() - frequencyMap.get(b).intValue();
            } else {
                // If frequencies are the same, sort by number in descending order
                return b - a;
            }
        });

        // Correct Step 4: Build the final result array from the sorted list.
        int[] result = new int[nums.length];
        int index = 0;
        
        for(int num : list) { // Iterate through the sorted list
            int freq = frequencyMap.get(num);
            for(int i = 0; i < freq; i++) {
                result[index++] = num;
            }
        }
        
        // Correct Step 5: Return the sorted array.
        return result;
    }

    public static void main(String[] args) {
        L1636 solution = new L1636();
        int[] nums = {1, 1, 2, 2, 2, 3};
        int[] sortedNums = solution.frequencySort(nums);
        System.out.println(Arrays.toString(sortedNums)); // Prints [3, 1, 1, 2, 2, 2]
    }
}