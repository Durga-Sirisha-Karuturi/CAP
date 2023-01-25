class Solution:
    def hasPathSum(self, root: Optional[TreeNode], targetSum: int) -> bool:
        def pathsum(node,value):
            if not node:
                return 0
            if(node==value):
                return node.val
            left=pathsum(node.left,value)
            right=pathsum(node.right,value)
            if(left==0 and right==0):
                return 0
            return left + right+ node.val
        def path(root,value,s):
            if not value:
                return False
            res=pathsum(root,value)
            if not value.left and not value.right:
                return res==s
            return path(root,value.left,s) and path(root,value.right,s)
        return path(root,root,targetSum)
