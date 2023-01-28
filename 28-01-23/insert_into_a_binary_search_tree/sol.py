#iterative

class Solution:
    def insertIntoBST(self, root: Optional[TreeNode], val: int) -> Optional[TreeNode]:
        req=TreeNode(val)
        if not root:
            return req
        cur=root
        parent=None
        while(cur!=None):
            parent=cur
            if(val<cur.val):
                cur=cur.left
            else:
                cur=cur.right
        if(val<parent.val):
            parent.left=req
        else:
            parent.right=req
        return root
