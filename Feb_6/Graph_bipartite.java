class Solution {
    public boolean isBipartite(int[][] graph) {
        int[] color = new int[graph.length];
        for(int i=0;i<graph.length;i++){
            if(color[i]==0 && !valid(graph,color,1,i)){
                return false;
            }
        }
       return true; 
    }
    boolean valid(int[][] graph,int[] color , int c,int i){
        if(color[i]!=0){
            return color[i]==c;
        }
        color[i]=c;
        for(int j:graph[i]){
            if(!valid(graph,color,-c,j)){
                return false;
            }
        }
        return true;
    }
}
