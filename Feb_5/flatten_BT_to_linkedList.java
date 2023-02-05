class Solution {
    List<Integer> arr=new ArrayList<>();
    void preorder(TreeNode node){
        if(node==null){
            return ;
        }
        arr.add(node.val);
        preorder(node.left);
        preorder(node.right);
    }
    public void flatten(TreeNode root) {
        preorder(root);
        for(int i=1;i<arr.size();i++){
            root.left=null;
            root.right=new TreeNode(arr.get(i));
            root=root.right;
        }
    }
}
