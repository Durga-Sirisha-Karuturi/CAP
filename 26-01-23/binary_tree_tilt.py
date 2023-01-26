class Solution:
    def findTilt(self, root: Optional[TreeNode]) -> int:
        self.sum=0
        def find(node):
            if not node:
                return 0
            if not node.left and not node.right:
                return node.val
            left=find(node.left)
            right=find(node.right)
            self.sum=self.sum+ abs(left-right)
            return left+right+node.val
        find(root)
        return self.sum
