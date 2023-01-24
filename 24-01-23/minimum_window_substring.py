class Solution:
    def minWindow(self,s: str, t: str) -> str:
        res=""
        if len(s)>=len(t):
            for i in range(0,len(s)):
                for j in range(i+1,len(s)+1):
                    temp=s[i:j]
                    flag=True
                    for k in t:
                        if k not in temp  or t.count(k)!=temp.count(k):
                            flag=False
                    if(flag):
                        res=temp
                        break
        return res
