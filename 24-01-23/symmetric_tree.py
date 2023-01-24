class Solution:
    def isSymmetric(self, root: Optional[TreeNode]) -> bool:
        def sameTree(p,q):
            if not p and not q:
                return True
            if not p or not q or p.val!=q.val :
                return False
            return  sameTree(p.left,q.right) and sameTree(p.right,q.left)
        return sameTree(root.left,root.right)
