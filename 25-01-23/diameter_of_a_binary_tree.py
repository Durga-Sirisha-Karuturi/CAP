class Solution:
    def diameterOfBinaryTree(self, root: Optional[TreeNode]) -> int:
        self.h=0
        def height(node):
            if not node:
                return 0
            left=height(node.left)
            right=height(node.right)
            return 1+max(left,right)
        def diameter(node):
            if not node:
                return 0
            lh=height(node.left)
            rh=height(node.right)
            if(lh+rh>self.h):
                self.h=lh+rh
            diameter(node.left)
            diameter(node.right)
        diameter(root)
        return self.h
