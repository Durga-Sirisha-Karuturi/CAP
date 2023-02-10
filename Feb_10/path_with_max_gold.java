class Solution {
    public int getMaximumGold(int[][] grid) {
        int max=0;
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]!=0){
                    max=Math.max(dfs(grid,visited,i,j),max);
                }
            }
        }
        return max;
    }
    int dfs(int[][] grid,boolean[][] visited , int i,int j){
        int ans=0;
        if(i<0 || i>=grid.length || j<0 || j>=grid[0].length || grid[i][j]==0 || visited[i][j]){
            return 0;
        }
        visited[i][j]=true;
        int up = dfs(grid,visited,i-1,j);
        int down = dfs(grid,visited,i+1,j);
        int left = dfs(grid,visited,i,j-1);
        int right = dfs(grid,visited,i,j+1);
        ans= grid[i][j]+Math.max(Math.max(Math.max(up,down),left),right);
        visited[i][j]=false;
        return ans;
    }
}
