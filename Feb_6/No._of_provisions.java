class Solution {
    void connected(int[][] isConnected , boolean[] visited , int i){
        for(int j=0 ;j<isConnected.length ; j++){
            if(isConnected[i][j]==1 && !visited[j]){
                visited[j]=true;
                connected(isConnected, visited ,j);
            }
        }
    }
    public int findCircleNum(int[][] isConnected) {
        int len=isConnected.length;
        boolean[] visited = new boolean[len];
        int provisions=0;
        for(int i=0;i<len; i++){
            if(!visited[i]){
                provisions+=1;
                connected(isConnected,visited,i);
            }
        }
        return provisions;
    }
}
