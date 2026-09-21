class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int n : nums) {
            freq.put(n, freq.getOrDefault(n, 0) + 1);
        }

        return freq.keySet().stream()
            .sorted((a, b) -> freq.get(b) - freq.get(a))
            .mapToInt(Integer::intValue)
            .limit(k)
            .toArray();
    }
}