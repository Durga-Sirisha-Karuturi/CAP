class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        Queue<Integer> queue = new LinkedList<>();
        HashSet<Integer> opened = new HashSet<>();
        queue.add(0);
        opened.add(0);
        while(!queue.isEmpty()){
            int cur = queue.poll();
            for(int j:rooms.get(cur)){
              if(!opened.contains(j)){
                queue.add(j);
                opened.add(j);
                if(rooms.size()==opened.size()){
                    return true;
                }  
            }

            }
        }
        return rooms.size()==opened.size();
    }
}
