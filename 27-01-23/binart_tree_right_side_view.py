class Solution:
    def rightSideView(self, root: Optional[TreeNode]) -> List[int]:
        if not root:
            return []
        l=[root]
        res=[]
        while l:
            length=len(l)
            for i in range(0,length):
                cur=l[0]
                l.remove(cur)
                if i==length-1:
                    res.append(cur.val)
                if cur.left:
                    l.append(cur.left)
                if cur.right:
                    l.append(cur.right)
        return res
