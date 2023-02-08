class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>> mat = new ArrayList<>();
       for(int i=0;i<numCourses;i++){
           mat.add(new ArrayList<>());
       } 
       for(int j=0 ; j<prerequisites.length ; j++){
           mat.get(prerequisites[j][1]).add(prerequisites[j][0]);
       }

       int[] indegree = new int[numCourses];
       for(int i=0 ; i<numCourses ;i++){
           for(int j:mat.get(i)){
               indegree[j]++;
           }
       }

       Queue<Integer> queue=new LinkedList<>();
       for(int i=0;i<numCourses;i++){
           if(indegree[i]==0){
               queue.add(i);
           }
       }

       int[] taken=new int[numCourses];
       int i=0;
       while(!queue.isEmpty()){
           int cur=queue.poll();
           taken[i++]=cur;

           for(int j: mat.get(cur)){
               indegree[j]--;
               if(indegree[j]==0){
                   queue.add(j);
               }
           }
       }


       if(i==numCourses){
           return taken;
       }
       int arr[]={};
       return arr ; 
    }
}
