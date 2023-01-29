class BSTIterator {
    List<Integer> arr=new ArrayList<Integer>();
    void inorder(TreeNode node){
        if(node==null){
            return ;
        }
        inorder(node.left);
        arr.add(node.val);
        inorder(node.right);
    }
    public BSTIterator(TreeNode root) {
        inorder(root);
    }
    
    public int next() {
        if (arr.size()>0){
            int req=arr.remove(0);
            return req;
        }
        return 0;
    }
    
    public boolean hasNext() {
        if (arr.size()>0){
            return true;
        }
        return false;
    }
}
