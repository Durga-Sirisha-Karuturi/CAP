class Solution:
    def postorderTraversal(self, root: Optional[TreeNode]) -> List[int]:
        l=[]
        def post(node):
            if not node:
                return 0
            post(node.left)
            post(node.right)
            l.append(node.val)
        post(root)
        return l
