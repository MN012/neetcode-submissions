class Solution:
    def findMin(self, nums: List[int]) -> int:
        low, high = 0, len(nums) - 1
        result = nums[0]

        while low <= high:
            if nums[low] <= nums[high]:
                result = min(result, nums[low])
                break
            mid = low + (high - low) // 2
            result = min(result, nums[mid])
            if nums[mid] >= nums[low]:
                low = mid + 1
            else:
                high = mid - 1
        return result
        