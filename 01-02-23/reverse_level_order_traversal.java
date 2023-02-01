class Tree
{
    ArrayList<Integer> arr=new ArrayList<>();
    void reverse(Node node){
    if(node==null){
        return ;
    }
    Queue<Node> queue=new LinkedList<>();
    queue.add(node);
    while(!queue.isEmpty()){
        Node cur= queue.poll();
        arr.add(cur.data);
        if(cur.right!=null){
            queue.add(cur.right);
        }
        if(cur.left!=null){
            queue.add(cur.left);
        }
        
    }
}
    public ArrayList<Integer> reverseLevelOrder(Node node) 
    {
        // code here
        reverse(node);
        Collections.reverse(arr);
        return arr;
    }
} 
