class Solution {
    List<Integer> arr = new ArrayList<>();
    void inorder(TreeNode node){
        if(node==null){
            return ;
        }
        inorder(node.left);
        arr.add(node.val);
        inorder(node.right);
    }
    TreeNode bst(int low,int high){
        if(high<low){
            return null;
        }
        int mid=(low+high)/2;
        TreeNode node=new TreeNode(arr.get(mid));
        node.left=bst(low,mid-1);
        node.right=bst(mid+1,high);
        return node;
    }
    public TreeNode balanceBST(TreeNode root) {
        inorder(root);
        return bst(0,arr.size()-1);
    }
}
