class Solution {
    int res=0;
    int count=0;
    void inorder(TreeNode node,int k){
        if(node==null) {
            return ;
        }
        inorder(node.left,k);
        count++;
        if(count==k){
            res=node.val;
            return;
        }
        inorder(node.right,k);

    }
    public int kthSmallest(TreeNode root, int k) {
        inorder(root,k);
        return res;
    }
}
