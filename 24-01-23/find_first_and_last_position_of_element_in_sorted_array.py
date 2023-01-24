class Solution:
    def searchRange(self, nums: List[int], target: int) -> List[int]:
        l=[-1,-1]
        length=len(nums)-1
        if target in nums:
            l[0]=nums.index(target)
            nums.reverse()
            l[1]=length-nums.index(target)
        return l
