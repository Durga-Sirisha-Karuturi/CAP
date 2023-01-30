class Solution {
    TreeNode BinTree(int[] in, int[] post,int is , int ie , int ps , int pe,HashMap<Integer,Integer> map){
        if(ps>pe || is>ie){
            return null;
        }
        TreeNode root=new TreeNode(post[pe]);
        int II = map.get(post[pe]);
        int count = ie-II;
        root.left = BinTree(in,post,is,II-1,ps,pe-count-1,map);
        root.right = BinTree(in,post,II+1,ie,pe-count,pe-1,map);
        return root;
    }
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        HashMap <Integer,Integer> inMap =new HashMap<>();
        for(int i=0;i<inorder.length;i++){
            inMap.put(inorder[i],i);
        }
        return BinTree(inorder,postorder,0,inorder.length-1,0,postorder.length-1,inMap);
    }    
   
}
