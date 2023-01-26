class Solution:
    def binaryTreePaths(self, root: Optional[TreeNode]) -> List[str]:
        s=""
        res=[]
        def path(node,p):
            l=[]
            if not node.left and not node.right:
                res.append(p+str(node.val))
            p+=str(node.val)+"->"
            if node.left:
                path(node.left,p)
            if node.right:
                path(node.right,p)
            return l
        path(root,s)
        return res
