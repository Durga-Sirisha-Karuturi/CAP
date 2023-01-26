class Solution:
    def constructMaximumBinaryTree(self, nums: List[int]) -> Optional[TreeNode]:
        if not nums:
            return
        m = max(nums)
        ind = nums.index(m)
        node = TreeNode(m)
        node.left = self.constructMaximumBinaryTree(nums[0:ind])
        node.right = self.constructMaximumBinaryTree(nums[ind + 1:])
        return node
