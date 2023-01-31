class Solution {
    List<Integer> lst=new ArrayList<>();
    void preorder(TreeNode node){
        if(node==null){
            return ;
        }
        lst.add(node.val);
        preorder(node.left);
        preorder(node.right);
    }
    public void flatten(TreeNode root) {
        if(root==null){
            return ;
        }
        preorder(root);
        TreeNode node=root;
        for(int i=1;i<lst.size();i++){
            node.left=null;
            node.right=new TreeNode(lst.get(i));
            node=node.right;
        }
    }
}
