class Solution {
    List<Integer> list=new ArrayList();
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        valid(root1,root2);
        Collections.sort(list);
        return list;
    }
    void valid(TreeNode root1,TreeNode root2){
        if(root1==null && root2==null){
            return ;
        }
        else if(root1==null && root2!=null){
            list.add(root2.val);
            valid(null,root2.left);
            valid(null,root2.right);
        }
        else if(root1!=null && root2==null){
            list.add(root1.val);
            valid(root1.left,null);
            valid(root1.right,null);
        }
        else{
            list.add(root1.val);
            list.add(root2.val);
            valid(root1.left,root2.left);
            valid(root1.right,root2.right);
        }
    }
}
