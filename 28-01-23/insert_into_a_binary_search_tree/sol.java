class Solution {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        TreeNode req=new TreeNode(val);
        if(root==null){
            return req;
        }
        TreeNode cur=root;
        TreeNode parent=null;
        while(cur!=null){
            parent=cur;
            if(val<cur.val){
                cur=cur.left;
            }
            else{
                cur=cur.right;
            }
        }
        if(val<parent.val){
            parent.left=new TreeNode(val);
        }
        else{
            parent.right=new TreeNode(val);
        }
        return root;
        
    }
}
