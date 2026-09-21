class Solution:
    def shipWithinDays(self, weights: List[int], days: int) -> int:
        low, high = max(weights), sum(weights)
        result = high

        while low <= high:
            mid = (low + high) // 2
            if self.canShip(weights, mid, days):
                result = mid
                high = mid - 1
            else:
                low = mid + 1
        return result

    def canShip(self, weights, capacity, days):
        days_needed = 1
        current = 0
        for w in weights:
            if current + w > capacity:
                days_needed += 1
                current = 0
            current += w
        return days_needed <= days