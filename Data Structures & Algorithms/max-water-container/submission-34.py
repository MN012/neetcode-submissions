class Solution:
    def maxArea(self, height: List[int]) -> int:
        r, l = len(height) - 1, 0
        max_area = 0

        while l < r:
            width = r - l
            current_area = min(height[l], height[r]) * width
            max_area = max(max_area, current_area)

            if height[l] < height[r]:
                l += 1
            else:
                r -= 1
        return max_area

