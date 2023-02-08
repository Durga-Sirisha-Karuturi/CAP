class Solution {
    int dfs(int i,int[] manager , int[] informTime){
        if(manager[i] != -1){
            informTime[i]=informTime[i]+dfs(manager[i],manager,informTime);
            manager[i] = -1;
        }
        return informTime[i];
    }
    public int numOfMinutes(int n, int headID, int[] manager, int[] informTime) {
        int time=0;
        for(int i=0;i<n;i++){
            time=Math.max(time,dfs(i,manager,informTime));
        }
        return time;
    }
}
