class Solution:
    def levelOrder(self, root: Optional[TreeNode]) -> List[List[int]]:
        if not root:
            return []
        curr=[root]
        next_level=[]
        level=[]
        res=[]
        while curr:
            for node in curr:
                level.append(node.val)
                if node.left:
                    next_level.append(node.left)
                if node.right:
                    next_level.append(node.right) 
            res.append(level)
            level=[]
            curr=next_level[]
            next_level=[]
        return res
