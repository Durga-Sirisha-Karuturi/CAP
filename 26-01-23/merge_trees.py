class Solution:
    def mergeTrees(self, root1: Optional[TreeNode], root2: Optional[TreeNode]) -> Optional[TreeNode]:
        def sum(node1,node2):
            if not node1 and not node2:
                return 0
            if not node1:
                return node2.val
            if not node2:
                return node1.val
            return node1.val+node2.val
        def new(node1,node2):
            if not node1 and not node2:
                return None
            if not node1:
                return node2
            if not node2:
                return node1
            r=sum(node1,node2)
            node=TreeNode(r)
            node.left=new(node1.left,node2.left)
            node.right=new(node1.right,node2.right)
            return node
        return new(root1,root2)
