class Solution {
    public int lengthOfLongestSubstring(String s) {
        int a=0,b=0;
        int m=0;
        HashSet<Character> set=new HashSet();
        while(b<s.length()){
            if(set.contains(s.charAt(b))){
                set.remove(s.charAt(a));
                a++;
            }
            else{
                set.add(s.charAt(b));
                b++;
                m=Math.max(set.size(),m);
            }
        }
        return m;
    }
}
