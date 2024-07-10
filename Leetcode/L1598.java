// File System
// Space Complexity as good as O(1)

class Solution {
    public int minOperations(String[] logs) {
        
        int level = 0;

        for(String log : logs){
            // case for comeing to the parent node from the child directory
            if(log.equals("../")){
                if(level!=0){
                    level--;
                }
            // case for staying in the same directory
            }else if(log.equals("./")){
                continue;
            }else{
                level++;
            }
        }
        return level;
    }
}