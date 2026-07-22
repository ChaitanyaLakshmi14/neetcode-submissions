class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        List<Integer>[] bucket = new ArrayList[nums.length + 1];
        HashMap<Integer, Integer> map = new HashMap<>();

        // Count frequencies
        for (int x : nums) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        // Place numbers into buckets
        for (int key : map.keySet()) {
            int freq = map.get(key);

            if (bucket[freq] == null) {
                bucket[freq] = new ArrayList<>();
            }

            bucket[freq].add(key);
        }

        int[] res = new int[k];
        int count = 0;

        // Traverse buckets from highest frequency
        for (int pos = bucket.length - 1; pos >= 0 && count < k; pos--) {
            if (bucket[pos] != null) {
                for (int num : bucket[pos]) {
                    res[count++] = num;
                    if (count == k) {
                        break;
                    }
                }
            }
        }

        return res;
    }
}
