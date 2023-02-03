class Solution {
    List<List<Integer>> arr = new ArrayList<>();
    boolean flag=true;
    void zigzag(TreeNode node){
        if(node==null){
            return ;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(node);
        while(!queue.isEmpty()){
            List<Integer> l = new ArrayList<>();
            int size=queue.size();
            for(int i=0;i<size;i++){
                TreeNode cur = queue.poll();
                l.add(cur.val);
                if(cur.left!=null){
                    queue.add(cur.left);
                }
                if(cur.right!=null){
                    queue.add(cur.right);
                }
            }
            if (flag){
                arr.add(l);
                flag=!flag;
            }
            else{
                Collections.reverse(l);
                arr.add(l);
                flag=!flag;
            }
        }
    }

                
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        zigzag(root);
        return arr;
    }
}
