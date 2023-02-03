class Solution {
    boolean sym(TreeNode p,TreeNode q){
        if(p==null && q==null){
            return true;
        }
        if(p==null || q==null || p.val!=q.val){
            return false;
        }
        return sym(p.left,q.right) && sym(p.right,q.left);
    }
    public boolean isSymmetric(TreeNode root) {
        return sym(root.left,root.right);
    }
}
