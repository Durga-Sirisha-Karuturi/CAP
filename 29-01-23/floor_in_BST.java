class Solution {
    static List<Integer> arr=new ArrayList<>();
    static void inorder(Node node){
        if(node==null){
            return ;
        }
        inorder(node.left);
        arr.add(node.data);
        inorder(node.right);
    }
    public static int floor(Node root, int x) {
        // Code here
        inorder(root);
        int val=-1;
        for(int i=0;i<arr.size();i++){
            if(arr.get(i)<=x){
                val=arr.get(i); 
            }
        }
        return val;
    }
}
