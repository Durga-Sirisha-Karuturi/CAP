class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> l=new ArrayList<>();
        if(root==null){
            return l;
        }
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int size=queue.size();
            for(int i=0;i<size;i++){
                TreeNode curr=queue.poll();
                if(i==size-1){
                    l.add(curr.val);
                }
                if(curr.left!=null){
                    queue.add(curr.left);
                }
                if(curr.right!=null){
                    queue.add(curr.right);
                }
            }
        }
        return l;
    }
}
