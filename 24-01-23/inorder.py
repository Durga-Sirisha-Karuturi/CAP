class Solution:
    def inorderTraversal(self, root: Optional[TreeNode]) -> List[int]:
        l=[]
        def inorder(node):
            if not node:
                return 0
            inorder(node.left)
            l.append(node.val)
            inorder(node.right)
        inorder(root)
        return l
