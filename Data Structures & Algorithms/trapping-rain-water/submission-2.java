class Solution {
    public int trap(int[] height) {
        int l = 0, r = height.length - 1;
        int maxLeft = 0, maxRight = 0;
        int total = 0;

        while (l < r) {
            if (height[l] <= height[r]) {
                maxLeft = Math.max(maxLeft, height[l]);
                total += maxLeft - height[l];
                l++;
            } else {
                maxRight = Math.max(maxRight, height[r]);
                total += maxRight - height[r];
                r--;
            }
        }
        return total;
    }
}