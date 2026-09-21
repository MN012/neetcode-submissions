class Solution:
    def splitArray(self, nums: List[int], k: int) -> int:
        low, high = max(nums), sum(nums)
        result = high

        while low <= high:
            mid = low + (high - low) // 2
            pieces = 1
            curr = 0
            for n in nums:
                if curr + n > mid:
                    pieces += 1
                    curr = 0
                curr += n
            if pieces <= k:
                result = mid
                high = mid - 1
            else:
                low = mid + 1
        return result