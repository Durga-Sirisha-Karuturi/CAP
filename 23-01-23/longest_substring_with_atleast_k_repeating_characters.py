class Solution:
    def longestSubstring(self, s: str, k: int) -> int:
        d=set(s);
        c=[]
        res=0
        if(k==1):
            res=len(s)
        elif(len(d)==1 and len(s)>=k):
            res=len(s)
        else:
            for i in range(0,len(s)):
                for j in range(i+1,len(s)+1):
                    temp=s[i:j]
                    flag=True
                    for l in temp:
                        if(temp.count(l)<k):
                            flag=False
                    if flag:
                         c.append(len(temp))
        if(len(c)>0):
            res=max(c)
        return res
