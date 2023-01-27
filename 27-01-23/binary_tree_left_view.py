// codestudio

from os import *
from sys import *
from collections import *
from math import *

# Binary tree node class for reference
class BinaryTreeNode:
    def __init__(self, data):
        self.data = data
        self.left = None
        self.right = None

def getLeftView(root)->list:
    if not root:
        return []
    l=[root]
    res=[]
    while l:
        length=len(l)
        for i in range(0,len(l)):
            cur=l[0]
            l.remove(cur)
            if(i==0):
                res.append(cur.data)
            if cur.left:
                l.append(cur.left)
            if cur.right:
                l.append(cur.right)
    return res
