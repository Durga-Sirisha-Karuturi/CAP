class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        int rows=grid.length;
        int cols=grid[0].length;
        if(grid[0][0]==1 || grid[rows-1][cols-1]==1){
            return -1;
        }
        int ans=0;
        int[][] dirs={{-1,-1},{-1,0},{-1,1},{0,-1},{0,1},{1,-1},{1,0},{1,1}};
        Queue<int[]> queue=new LinkedList<>();
        queue.add(new int[]{0,0});
        boolean[][] visited = new boolean[rows][cols];
        visited[0][0]=true;
        while(!queue.isEmpty()){
            int size=queue.size();
            ans++;
            for(int i=0;i<size;i++){
                int[] cur = queue.poll();
                if(cur[0]==rows-1 && cur[1]==cols-1){
                    return ans;
                }
                for(int[] dir:dirs){
                    int x= cur[0]+dir[0];
                    int y= cur[1]+dir[1];
                    if(x<0 || y<0 || x>=rows || y>=cols || visited[x][y] || grid[x][y]==1){
                        continue;
                    }
                    visited[x][y]=true;
                    queue.add(new int[]{x,y});
                }
            }
        }
        return -1;
    }
}
