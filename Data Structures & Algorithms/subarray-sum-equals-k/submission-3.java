class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> prefixCount = new HashMap<>();
        prefixCount.put(0, 1);
        int curr = 0;
        int count = 0;

        for (int num : nums) {
            curr += num;
            count += prefixCount.getOrDefault(curr - k, 0);
            prefixCount.put(curr, prefixCount.getOrDefault(curr, 0) + 1);
        }

        return count;
    }
}