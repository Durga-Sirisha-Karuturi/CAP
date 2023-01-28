class Solution {
    public TreeNode searchBST(TreeNode root, int val) {
        if(root==null){
            return null;
        }
        TreeNode cur=root;
        while(cur!=null){
            if(cur.val==val){
                TreeNode node=cur;
                node.left=cur.left;
                node.right=cur.right;
                return node;
            }
            else if(val<cur.val){
                cur=cur.left;
            }
            else{
                cur=cur.right;
            }
        }
        return null;
        
    }
}
