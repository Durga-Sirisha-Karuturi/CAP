class Solution {
    List<Integer> arr=new ArrayList<>();
    void inorder(TreeNode node){
        if(node==null){
            return ;
        }
        inorder(node.left);
        arr.add(node.val);
        inorder(node.right);
    }
    public int kthSmallest(TreeNode root, int k) {
        inorder(root);
        return arr.get(k-1);
    }
}
