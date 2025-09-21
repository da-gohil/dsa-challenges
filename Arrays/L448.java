import java.util.*;

//Approach 02
// Done it without extra space and in O(n) runtime
class L448 {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> missingNumbers = new ArrayList<>();
        
        // Mark presence
        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;
            if (nums[index] > 0) {
                nums[index] = -nums[index];
            }
        }
        
        // Find missing numbers
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                missingNumbers.add(i + 1);
            }
        }
        
        return missingNumbers;
    }

    public static void main(String[] args) {
        L448 sol = new L448();
        int[] nums = {1, 2, 2, 4};
        System.out.println(sol.findDisappearedNumbers(nums)); // Output: [3]
    }
}


// Attempt 01
// class L448 {
//     public List<Integer> findDisappearedNumbers(int[] nums) {
//         List<Integer> missingNumbers = new ArrayList<>();
//         Arrays.sort(nums);
//         int range = nums.length;

//         for(int i=1; i<=nums.length; i++){
//             missingNumbers.add(i);
//         }
//         for(int i=0; i<nums.length;i++){
//             if(nums[i]!=missingNumbers.get(i)){
//                 missingNumbers.remove(i);
//             }
//         }
//         return missingNumbers;
//     }
//     public static void main(String []args){
//         int[] nums = {1,2,2,4};
//         L448 sol = new L448();
//         System.out.println(sol.findDisappearedNumbers(nums));
//     }
// }