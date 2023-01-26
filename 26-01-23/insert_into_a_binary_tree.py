class Solution:
    def insertIntoBST(self, root: Optional[TreeNode], val: int) -> Optional[TreeNode]:
        def insert(node,val):
            if not node:
                return TreeNode(val)
            if val<node.val:
                if not node.left:
                    node.left=TreeNode(val)
                insert(node.left,val)
            if val>node.val:
                if not node.right:
                    node.right=TreeNode(val)
                insert(node.right,val)
            return node
        return insert(root,val)
