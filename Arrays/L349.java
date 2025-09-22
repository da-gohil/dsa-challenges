import java.util.HashSet;
import java.util.Set;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
    
    Set<Integer> set1 = new HashSet<>();

    for(int num1 : nums1){
        set1.add(num1);        
    }

    Set<Integer> intersectionSet = new HashSet<>();
    for(int num : nums2){ 
        if(set1.contains(num)){
            intersectionSet.add(num);
        }
    }

    int [] result = new int [intersectionSet.size()];
    int i = 0; // Initialize the counter outside the loop

    for(int num : intersectionSet){ // Corrected loop syntax
        result[i] = num;
        i++;
    }
     return result;
    }
}