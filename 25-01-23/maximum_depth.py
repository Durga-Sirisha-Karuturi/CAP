class Solution:
    def maxDepth(self, root: Optional[TreeNode]) -> int:
        def height(node):
            if not node:
                return 0
            left=height(node.left)
            right=height(node.right)
            return 1+max(left, right)
        if not root:
            return 0
        a=height(root.left)
        b=height(root.right)
        return max(a,b)+1
