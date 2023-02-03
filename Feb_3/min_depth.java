class Solution {
    int min=Integer.MIN_VALUE;
    int height(TreeNode node){
        if(node==null){
            return 0;
        }
        int left=height(node.left);
        int right = height(node.right);
        if(node.left==null && node.right==null){
            return 1;
        }
        if(node.right==null){
            return 1+left;
        }
        if(node.left==null){
            return 1+right;
        }
        return Math.min(left,right)+1;
    }
    public int minDepth(TreeNode root) {
        return height(root);

    }
}
