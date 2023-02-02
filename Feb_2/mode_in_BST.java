class Solution {
    List<Integer> arr = new ArrayList<>();
    int max=0,count=0,lastVal=Integer.MAX_VALUE;
    void inorder(TreeNode node){
        if(node==null){
            return ;
        }
        inorder(node.left);
        if(node.val==lastVal){
            count+=1;
        }
        else{
            count=1;
        }
        if(count>max){
            max=count;
            arr.clear();
            arr.add(node.val);
        }
        else if(count==max){
            arr.add(node.val);
        }
        lastVal=node.val;
        inorder(node.right);
    }
    public int[] findMode(TreeNode root) {
        inorder(root);
        int[] ans = new int[arr.size()];
        for(int i=0;i<arr.size();i++){
            ans[i]=(arr.get(i));
        }
        return ans;
    }
}
