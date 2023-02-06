class Solution {
    public int orangesRotting(int[][] grid) {
        if(grid.length==0){
            return 0;
        }
        int rows=grid.length;
        int cols=grid[0].length;
        Queue<int[]> queue=new LinkedList<>();
        int fresh=0;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(grid[i][j]==2){
                    queue.add(new int[]{i,j});
                }
                else if(grid[i][j]==1){
                    fresh+=1;
                }
            }
        }
        if(fresh==0){
            return 0;
        }
        int time=0;
        int[] arr1 =new int[]{1,-1,0,0};
        int[] arr2=new int[]{0,0,-1,1};
        while(!queue.isEmpty() && fresh>0){
            time+=1;
            int size=queue.size();
            for(int i=0;i<size;i++){
                int[] pos= queue.poll();
                for(int j=0;j<4;j++){
                    int r=pos[0]+arr1[j];
                    int c=pos[1]+arr2[j];
                    if(r<0 || c<0 || r>=rows || c>=cols || grid[r][c]==0 || grid[r][c]==2){
                        continue;
                    }
                    grid[r][c]=2;
                    queue.add(new int[]{r,c});
                    fresh--;
                }
            }
        }
        if(fresh==0){
            return time;
        }
        else{
            return -1;
        }
        
    }
}
