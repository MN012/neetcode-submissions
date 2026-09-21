class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set_nums = new HashSet<>();
        int longest = 0;

        for (int i = 0; i < nums.length; i++) {
            set_nums.add(nums[i]);
        }

        for (int sn : set_nums) {
            if (!set_nums.contains(sn - 1)) { 
                int length = 1;
                while (set_nums.contains(sn + length)) {
                    length++;
                }
                longest = Math.max(length, longest);
            }
        }
        return longest;
    }
}