class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int rows=image.length;
        int cols=image[0].length;
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{sr,sc});
        int val=image[sr][sc];
        image[sr][sc]=color;
        int[] arr1=new int[]{1,-1,0,0};
        int[] arr2=new int[]{0,0,-1,1};
        while(!queue.isEmpty()){
            int size=queue.size();
            for(int i=0;i<size;i++){
                int[] pos=queue.poll();
                for(int j=0;j<4;j++){
                    int r=pos[0]+arr1[j];
                    int c=pos[1]+arr2[j];
                    if(r<0 || c<0 || r>=rows || c>=cols || image[r][c]!=val || image[r][c]==color){
                        continue;
                    }
                    image[r][c]=color;
                    queue.add(new int[]{r,c});
                }
            }
        }
        return image;
    }
}
