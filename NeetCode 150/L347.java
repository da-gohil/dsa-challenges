class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // Creating a new bucket
        List<Integer>[] bucket = new List[nums.length + 1];
        // Creating an occurrence Map
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        // Populating the frequency Map
        for (int n : nums) {
            frequencyMap.put(n, frequencyMap.getOrDefault(n, 0) + 1);
        }

        // Populating the buckets
        for (int key : frequencyMap.keySet()) {
            int frequency = frequencyMap.get(key);

            // If bucket does not exist, create a new bucket for the first iteration
            if (bucket[frequency] == null) {
                bucket[frequency] = new ArrayList<>();
            }
            bucket[frequency].add(key);
        }

        // Final step -> Create a result variable that stores "K" most frequent elements
        // And that will iterate through all the buckets from the reverse direction

        int[] res = new int[k];
        int count = 0;
        // Traverse from right to left
        for (int pos = bucket.length - 1; pos >= 0 && count < k; pos--) {
            if (bucket[pos] != null) {
                for (Integer integer : bucket[pos]) {
                    if (count < k) {
                        res[count++] = integer;
                    } else {
                        break;
                    }
                }
            }
        }
        return res;
    }
}
