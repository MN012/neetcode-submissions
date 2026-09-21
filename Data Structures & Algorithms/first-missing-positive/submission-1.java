class Solution {
    public int firstMissingPositive(int[] nums) {
        Set<Integer> array = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            array.add(nums[i]);
        }

        for (int i = 1; i <= nums.length + 1; i++) {
            if (!array.contains(i)) {
                return i;
            }
        }

        return nums.length + 1;
    }
}