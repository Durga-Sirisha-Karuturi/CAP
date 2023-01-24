class Solution:
    def preorderTraversal(self, root: Optional[TreeNode]) -> List[int]:
        l=[]
        def preorder(node):
            if not node:
                return 0
            l.append(node.val)
            preorder(node.left)
            preorder(node.right)
        preorder(root)
        return l
