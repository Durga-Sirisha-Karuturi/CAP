class Solution {
    TreeNode prev=null;
    TreeNode one=null;
    TreeNode two=null;
    void inorder(TreeNode curr){
        if(curr==null){
            return ;
        }
        inorder(curr.left);
        if(prev!=null && prev.val>curr.val){
            if(one==null){
                one=prev;
            }
            two=curr;
        }
        prev=curr;
        inorder(curr.right);
    }
    void swap(TreeNode node){
        inorder(node);
        int temp=one.val;
        one.val=two.val;
        two.val=temp;
    }
    public void recoverTree(TreeNode root) {
        swap(root);   
    }
}
