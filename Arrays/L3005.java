import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class L3005 {
    
    public int maxFrequencyElements(int[] nums) {
        
        Map<Integer, Integer> freqMap = new HashMap<>();
        
        for(int num: nums){
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        int maxFrequency = 0;
        if(!freqMap.isEmpty()){
            maxFrequency = Collections.max(freqMap.values());
        }

        int totalCount = 0;
        for(int freq : freqMap.values()){
            if(freq == maxFrequency){
                totalCount += freq;
            }
        }
        
        return totalCount;
    }

    public static void main(String[] args){
        L3005 sol = new L3005();
        int[] numbers = {1, 2, 3, 4, 5};
        int res = sol.maxFrequencyElements(numbers);
        System.out.println("Result: " + res); // Corrected printing syntax
    }
}