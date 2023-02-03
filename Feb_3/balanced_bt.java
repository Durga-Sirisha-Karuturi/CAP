class Solution {
    boolean flag=true;
    int height(TreeNode node){
        if(node==null){
            return 0;
        }
        int left=height(node.left);
        int right=height(node.right);
        if(Math.abs(left-right)>1){
            flag=false;
        }
        return Math.max(left,right)+1;
    }
    public boolean isBalanced(TreeNode root) {
        height(root);
        return flag;
    }
}
