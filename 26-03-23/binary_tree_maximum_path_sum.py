class Solution:
    def maxPathSum(self, root: Optional[TreeNode]) -> int:
        self.res=root.val
        def path(node):
            if not node:
                return 0
            left=max(0,path(node.left))
            right=max(0,path(node.right))
            self.res=max(self.res,left+right+node.val)
            return max(left,right)+node.val
        path(root)
        return self.res
