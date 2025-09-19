import java.util.HashSet;

class Solution {
    public boolean containsDuplicate(int[] nums) {

        //Initialize a HashSet as it will not allow duplicates to be inserted
        HashSet <Integer> hashSet = new HashSet<>();

        //Going through all the elements of the input array
        for(int num : nums){
            if(hashSet.contains(num)){
                return true;
            }
            hashSet.add(num);
        }
        return false;
    }
    public static void main(String[] args){
        //Create an instance of the class
        Solution solution = new Solution();
        int [] numbers = {1,2,3,4,5,6,7,8,2};

        //Call the method of the class
        boolean result = solution.containsDuplicate(numbers);
        System.out.println(result);
    }
}