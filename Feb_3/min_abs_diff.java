class Solution {
    int prev= Integer.MAX_VALUE;
    int min = Integer.MAX_VALUE;
    void inorder(TreeNode node){
        if(node==null){
            return ;
        }
        inorder(node.left);
        min=Math.min(min,Math.abs(prev-node.val));
        prev=node.val;
        inorder(node.right);
    }
    public int getMinimumDifference(TreeNode root) {
        inorder(root);
        return min;
    }
}
