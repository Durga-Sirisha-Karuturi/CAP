class Solution {
    int h=Integer.MIN_VALUE;
    int height(TreeNode node){
        if(node==null){
            return 0;
        }
        int left=height(node.left);
        int right=height(node.right);
        h=Math.max(h,left+right);
        return 1+Math.max(left,right);
    }
    public int diameterOfBinaryTree(TreeNode root) {
        height(root);
        return h;
    }
}
