class Solution:
    def isValidBST(self, root: Optional[TreeNode]) -> bool:
        arr=[]
        def inorder(node):
            if not node:
                return
            inorder(node.left)
            arr.append(node.val)
            inorder(node.right)
        inorder(root)
        if (arr==sorted(arr) and len(set(arr))==len(arr)):
            return True
        else:
            return False
