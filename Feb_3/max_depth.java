class Solution {
    int height(TreeNode node){
        if(node==null){
            return 0;
        }
        int left=height(node.left);
        int right=height(node.right);
        return Math.max(left,right)+1;
    }
    public int maxDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        return Math.max(height(root.left),height(root.right))+1;
    }
}
