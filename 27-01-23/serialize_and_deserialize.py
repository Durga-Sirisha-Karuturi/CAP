class Codec:

    def serialize(self, root):
        """Encodes a tree to a single string.
        
        :type root: TreeNode
        :rtype: str
        """
        if not root:
            return "N"
        res=[]
        l=[root]
        res=[str(root.val)]
        while(l):
            length=len(l)
            for i in range(0,length):
                cur=l[0]
                l.remove(cur)
                if not cur:
                    res.append("N")
                res.append(str(cur.val))
                l.append(cur.left)
                l.append(cur.right)
        return ",".join(res)
        

    def deserialize(self, data):
        """Decodes your encoded data to tree.
        
        :type data: str
        :rtype: TreeNode
        """
        val=iter(data.split(","))
        def des():
            if val=="N":
                return None
            node=TreeNode(str(val))
            node.left=des()
            node.right=des()
            return node
        return des()
