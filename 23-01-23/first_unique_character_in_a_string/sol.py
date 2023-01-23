class Solution:
    def firstUniqChar(self, s: str) -> int:
        ind=-1
        for i in range(0,len(s)):
            if(s.count(s[i])==1):
                ind=i
                break;
        return ind
