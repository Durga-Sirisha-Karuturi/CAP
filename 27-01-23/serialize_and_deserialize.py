class Codec:

    def serialize(self, root):
        """Encodes a tree to a single string.
        
        :type root: TreeNode
        :rtype: str
        """
        res=[]
        if not root:
            res.append("NO")
        l=[root] 
        res.append(str(root.val))
        while(l):
            for i in range(0,len(l)):
                cur=l[0]
                l.remove(cur)
                if cur.left:
                    l.append(cur.left)
                    res.append(str(cur.left.val))
                if cur.right:
                    l.append(cur.right)
                    res.append(str(cur.right.val))
        return ",".join(res)

    def deserialize(self, data):
        """Decodes your encoded data to tree.
        
        :type data: str
        :rtype: TreeNode
        """
        value=iter(data.split(","))
        def des():
            if value=="NO":
                return None
            node= TreeNode(int(value))
            node.left=des()
            node.right=des()
            return node
        return des()
