class Solution:
    def invertTree(self, root: Optional[TreeNode]) -> Optional[TreeNode]:
        def inv(node):
            if node:
                temp=node.left
                node.left=node.right
                node.right=temp
                if node.left:
                    inv(node.left)
                if node.right:
                    inv(node.right)
        inv(root)
        return root
