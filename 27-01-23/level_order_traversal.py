class Solution:
    def levelOrder(self, root: Optional[TreeNode]) -> List[List[int]]:
        if not root:
            return []
        l=[root]
        res=[[root.val]]
        while(len(l)!=0):
            l1=[]
            length=len(l)
            for i in range(0,length):
                cur=l[0]
                l.remove(cur)
                if cur.left:
                    l1.append(cur.left.val)
                    l.append(cur.left)
                if cur.right:
                    l1.append(cur.right.val)
                    l.append(cur.right)
            if l1: 
                res.append(l1)
                l1=[]
        return res
