// Time limit exceeded

class Solution {
    public int firstUniqChar(String s) {
        int n=s.length();
        int freq[]=new int[n];
        int ind=-1;
        for(int i=0;i<n;i++){
            freq[i]=0;
            for(int j=0;j<n;j++){
                if(s.charAt(i)==s.charAt(j)){
                    freq[i]++;
                }
            }
            if(freq[i]==1){
                ind=i;
                break;
            }
        }
        return ind;
    }
}
