class Solution {
    public boolean checkIfExist(int[] arr) {
        if(arr == null || arr.length == 0){
            return false;
        }

        for(int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[i] == 2 * arr[j] || arr[j] == 2 * arr[i]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 7, 11};
        Solution sol = new Solution();
        System.out.println(sol.checkIfExist(arr));  // Output: false
    }
}
