class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
       ArrayList<ArrayList<Integer>> mat = new ArrayList<>();
       for(int i=0;i<numCourses;i++){
           mat.add(new ArrayList<>());
       } 
       for(int j=0 ; j<prerequisites.length ; j++){
           mat.get(prerequisites[j][0]).add(prerequisites[j][1]);
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

       List<Integer> taken=new ArrayList<>();
       while(!queue.isEmpty()){
           int cur=queue.poll();
           taken.add(cur);

           for(int j: mat.get(cur)){
               indegree[j]--;
               if(indegree[j]==0){
                   queue.add(j);
               }
           }
       }

       if(taken.size()==numCourses){
           return true;
       }
       return false;
       
    }
}
