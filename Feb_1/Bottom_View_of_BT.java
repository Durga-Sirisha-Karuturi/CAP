class Solution
{
    //Function to return a list containing the bottom view of the given tree.
    public ArrayList <Integer> bottomView(Node root)
    {
        // Code here
        ArrayList<Integer> arr=new ArrayList<>();
        TreeMap<Integer,Integer> map=new TreeMap<>();
        Queue<Node> queue=new LinkedList<>();
        queue.add(root);
        root.hd=0;
        while(!queue.isEmpty()){
            Node cur=queue.poll();
            map.put(cur.hd,cur.data);
            if(cur.left!=null){
                queue.add(cur.left);
                cur.left.hd= cur.hd-1;
            }
            if(cur.right!=null){
                queue.add(cur.right);
                cur.right.hd=cur.hd+1;
            }
        }
        map.forEach((key, value) -> arr.add(value));
        return arr;
    }
}
