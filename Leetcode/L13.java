//Leetcode 13 - Roman to Integer conversion

import java.util.HashMap;

public class Solution {

    public static int romanToInt(String s) {
        // Create a map to store Roman numerals and their corresponding values
        HashMap<Character, Integer> romanValues = new HashMap<>();
        romanValues.put('I', 1);
        romanValues.put('V', 5);
        romanValues.put('X', 10);
        romanValues.put('L', 50);
        romanValues.put('C', 100);
        romanValues.put('D', 500);
        romanValues.put('M', 1000);

        // Initialize the result variable
        int result = 0;
        
        // Traverse the string
        for (int i = 0; i < s.length(); i++) {
            int currentValue = romanValues.get(s.charAt(i));
            
            // If the next numeral is larger, subtract the current value
            if (i < s.length() - 1 && currentValue < romanValues.get(s.charAt(i + 1))) {
                result -= currentValue;
            } else {
                // Otherwise, add the current value
                result += currentValue;
            }
        }
        
        return result;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(romanToInt("III"));     // Output: 3
        System.out.println(romanToInt("IV"));      // Output: 4
        System.out.println(romanToInt("IX"));      // Output: 9
        System.out.println(romanToInt("LVIII"));   // Output: 58
        System.out.println(romanToInt("MCMXCIV")); // Output: 1994
    }
}
