class Solution {
    boolean valid(TreeNode root,long min,long max){
        if(root==null){
            return true;
        }
        if(root.val >= max|| root.val <= min){
            return false;
        }
        return valid(root.left,min,root.val) && valid(root.right,root.val,max);
    }
    public boolean isValidBST(TreeNode root) {
        long min=Long.MIN_VALUE;
        long max=Long.MAX_VALUE;
        return valid(root,min,max);
    }
}
