class Solution {
    List<List<Integer>> arr = new ArrayList<>();
    void level(TreeNode node){
        if(node==null){
            return ;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(node);
        while(!queue.isEmpty()){
            List<Integer> l = new ArrayList<>();
            int size=queue.size();
            for(int i=0;i<size;i++){
                TreeNode curr = queue.poll();
                l.add(curr.val);
                if(curr.left!=null){
                    queue.add(curr.left);
                }
                if(curr.right!=null){
                    queue.add(curr.right);
                }
            }
            arr.add(l);
        }
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        level(root);
        return arr;
    }
}
