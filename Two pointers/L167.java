//Approach 01 - using predefined method by Java Library - reverse
class Solution {
    public boolean isPalindrome(String s) {
        // Step 01 - Convert upper case to lower case & Remove all non-alphanumeric values
        String s1 = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        
        // Step 02 - Use StringBuilder to reverse the string
        StringBuilder sb = new StringBuilder(s1);
        String s2 = sb.reverse().toString();
        
        // Step 03 - Compare the original converted string to the reversed converted string
        return s1.equals(s2);
    }
}

//Approach 02 - Without using reverse predefined method of java

class Solution {
    public boolean isPalindrome(String s) {
        // Step 01 - Convert upper case to lower case & Remove all non-alphanumeric values
        String s1 = s.toLowerCase().replaceAll("[^a-z0-9]", "");

        int i = 0;
        int j = s1.length() - 1;
        
        while (i <= j) {
            if (s1.charAt(i) != s1.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }        
        return true;
    }
}
