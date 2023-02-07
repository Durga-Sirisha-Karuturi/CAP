class Solution {
    int[][] dirs=new int[][]{{-1,0},{0,1},{1,0},{0,-1}};
    public boolean containsCycle(char[][] grid) {
        int rows=grid.length;
        int cols=grid[0].length;
        boolean[][] visited=new boolean[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(!visited[i][j]){
                    if(cycle(grid,visited,i,j,-1,-1)){
                        return true;
                    }
                }
            }
        }
        return false;
    }
    boolean cycle(char[][] grid,boolean[][] visited,int i,int j,int prevr,int prevc){
        visited[i][j]=true;
        for(int[] dir:dirs){

            int x=i+dir[0];
            int y=j+dir[1];

            if(x<0 || y<0 || x>=grid.length || y>=grid[0].length || grid[i][j]!=grid[x][y]){
                continue;
            }
            
            if(x==prevr && y==prevc){
                continue;
            }

            if(visited[x][y]){
                return true;
            }

            if(cycle(grid,visited,x,y,i,j)){
                return true;
            }
        }
        return false;
    }
}
