//Approach 01 - Sliding window - abit lengthy but worth knowing the concept

class Solution {
    public int countGoodSubstrings(String s) {
        // Step 1: Initialize a counter for good substrings
        int goodSubstringCount = 0;

        // Step 2: Iterate over the string using a sliding window
        for (int windowStart = 0; windowStart <= s.length() - 3; windowStart++) {
            // Step 3: Get the characters in the current window
            char firstChar = s.charAt(windowStart);
            char secondChar = s.charAt(windowStart + 1);
            char thirdChar = s.charAt(windowStart + 2);

            // Step 4: Check if all characters in the window are distinct
            if (firstChar != secondChar && firstChar != thirdChar && secondChar != thirdChar) {
                // Step 5: Increment the counter if the substring is good
                goodSubstringCount++;
            }
        }

        // Step 6: Return the count of good substrings
        return goodSubstringCount;
    }
}

//Approach 02 - Simple Core Java way of application
class Solution {
    public int countGoodSubstrings(String s) {
        int count=0;
        for(int i=0;i<s.length()-2;i++){
            if(s.charAt(i)!=s.charAt(i+1) && s.charAt(i+1)!=s.charAt(i+2) && s.charAt(i)!=s.charAt(i+2)) count++;
        }
   return count;     
    }
}