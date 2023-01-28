class Solution:
    # returns the inorder successor of the Node x in BST (rooted at 'root')
    def inorderSuccessor(self, root, x):
        # Code here
        arr=[]
        def inorder(node):
            if not node:
                return ;
            inorder(node.left)
            arr.append(node.data)
            inorder(node.right)
        inorder(root)
        for i in range(0,len(arr)):
            if(arr[i]>x.data):
                return Node(arr[i])
