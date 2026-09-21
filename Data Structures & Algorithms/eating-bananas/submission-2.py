class Solution:
    def minEatingSpeed(self, piles: List[int], h: int) -> int:
        low, high = 1, max(piles)  # search between slowest and fastest
        result = max(piles)         # worst case answer

        while low <= high:
            mid = (low + high) // 2
            if sum(math.ceil(p / mid) for p in piles) <= h:  # can we finish?
                result = mid    # yes → save it, try slower
                high = mid - 1
            else:
                low = mid + 1   # no → try faster
        return result
