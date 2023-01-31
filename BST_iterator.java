class BSTIterator {
    Stack<TreeNode> stack = new Stack<>();
    public BSTIterator(TreeNode root) {
        push(root);
    }
    public void push(TreeNode node){
        while(node!=null){
            stack.push(node);
            node=node.left;
        }
    }
    public int next() {
        TreeNode cur=stack.pop();
         push(cur.right);
         return cur.val;
    }
    
    public boolean hasNext() {
        return !stack.isEmpty();
    }
}
