class Solution {
    List<Integer> arr= new ArrayList<>();
    void inorder(TreeNode node){
            if(node==null){
                return ;
            }
            inorder(node.left);
            arr.add(node.val);
            inorder(node.right);
        }
        boolean isSorted(){
            for(int i=0;i<arr.size()-1;i++){
                if(arr.get(i)>=arr.get(i+1)){
                    return false;
                }
            }
            return true;
        }
    public boolean isValidBST(TreeNode root) {
        inorder(root);
        return isSorted();
    }
}
