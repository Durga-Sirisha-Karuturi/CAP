    static class Pair{
        Node node;
        int hd;
        public Pair(Node n,int hd ){
            this.node=n;
            this.hd=hd;
        }
    }
     
    public static void topView(Node root) {
        if(root == null) {
            System.out.println();
        }
        Map<Integer, Integer> map = new TreeMap<>();
        Queue<Pair> queue = new LinkedList<Pair>();
        queue.add(new Pair(root, 0)); 
        
        while(!queue.isEmpty()) {
            Pair cur = queue.poll();
            if(!map.containsKey(cur.hd)){
                map.put(cur.hd, cur.node.data);
            }
            if(cur.node.left != null) {
                queue.add(new Pair(cur.node.left, cur.hd - 1)); 
            }
            if(cur.node.right != null) {
                queue.add(new Pair(cur.node.right,cur.hd + 1)); 
            }
        }
    
        for (Map.Entry<Integer,Integer> entry : map.entrySet()) {
            System.out.print(entry.getValue()+" "); 
        }
    }
