class Solution:
    def searchBST(self, root: Optional[TreeNode], val: int) -> Optional[TreeNode]:
        if not root:
            return None
        cur=root
        while(cur!=None):
            if(cur.val==val):
                node=cur
                node.left=cur.left
                node.right=cur.right
                return node
            elif(val<cur.val):
                cur=cur.left
            else:
                cur=cur.right
        return None
