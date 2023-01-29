//Geeks for geeks

class Tree {
    List<Integer> arr=new ArrayList<>();
    void inorder(Node node){
        if(node==null){
            return ;
        }
        inorder(node.left);
        arr.add(node.data);
        inorder(node.right);
    }
    // Function to return the ceil of given number in BST.
    int findCeil(Node root, int key) {
        if (root == null) return -1;
        // Code here
        inorder(root);
        int val=-1;
        for(int i=0;i<arr.size();i++){
            if(arr.get(i)>=key){
                val=arr.get(i);
                break;
            }
        }
        return val;
    }
}
