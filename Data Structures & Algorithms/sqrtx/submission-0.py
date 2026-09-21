class Solution:
    def mySqrt(self, x: int) -> int:
        low, high = 1, x
        result = 0
        while low <= high:
            mid = low + (high - low) // 2
            if mid * mid <= x:
                result = mid  # could be the answer, but try higher
                low = mid + 1
            else:
                high = mid - 1
        return result