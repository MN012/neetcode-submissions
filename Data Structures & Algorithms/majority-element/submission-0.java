class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();


        for (int n : nums) {
            freq.put(n, freq.getOrDefault(n, 0) + 1);
            if(freq.get(n) > nums.length / 2){
                return n;
            }
        }

    return -1;
        


    }
}