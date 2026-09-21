class Solution:
    def numRescueBoats(self, people: List[int], limit: int) -> int:
      people.sort()
      l, r = 0, len(people)-1
      maxPeople = 0
        
      while l <= r:
         if people[r] + people[l] <= limit:
            l += 1
         r -= 1
         maxPeople += 1
      return maxPeople