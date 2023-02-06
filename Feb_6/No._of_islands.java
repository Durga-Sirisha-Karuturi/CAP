class Solution {
    void water(char[][] grid,int r, int c){
        if(r<0 || c<0 || r>=grid.length || c>=grid[0].length || grid[r][c]=='0'){
            return;
        }
        grid[r][c]='0';
        water(grid,r+1,c);
        water(grid,r-1,c);
        water(grid,r,c+1);
        water(grid,r,c-1);
    }
    public int numIslands(char[][] grid) {
        int rows=grid.length;
        int cols=grid[0].length;
        int islands=0;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(grid[i][j]=='1'){
                    islands+=1;
                    water(grid,i,j);
                }
            }
        }
        return islands;
    }
}
