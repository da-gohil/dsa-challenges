//Leetcode 28 - Index of first occurrence

class Solution {
    public int strStr(String haystack, String needle) {
        
        for(int i=0; i<haystack.length()-needle.length()+1; i++){
            if(haystack.charAt(i) == needle.charAt(i)){
                if(haystack.substring(i, needle.length()+1).equals(needle)){
                    return i;
                }
            }
        }
        return -1;
    }
}