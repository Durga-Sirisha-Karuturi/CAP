class Solution:
    def minDepth(self, root: Optional[TreeNode]) -> int:
        def height(node):
            if not node:
                return 0
            left=height(node.left)
            right=height(node.right)
            if not node.left and not node.right:
                return 1
            if not node.left:
                return 1+ right
            if not node.right:
                return 1+ left
            return 1+ min(left,right)
        return height(root)
