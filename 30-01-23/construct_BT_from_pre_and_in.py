class Solution {
    TreeNode BinTree(int[] pre, int[] in,int ps , int pe , int is , int ie,HashMap<Integer,Integer> map){
        if(ps>pe || is>ie){
            return null;
        }
        TreeNode root=new TreeNode(pre[ps]);
        int II = map.get(pre[ps]);
        int count = II-is;
        root.left = BinTree(pre,in,ps+1,ps+count,is,II-1,map);
        root.right = BinTree(pre,in,ps+count+1,pe,II+1,ie,map);
        return root;
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        HashMap <Integer,Integer> inMap =new HashMap<>();
        for(int i=0;i<inorder.length;i++){
            inMap.put(inorder[i],i);
        }
        return BinTree(preorder,inorder,0,preorder.length-1,0,inorder.length-1,inMap);
        
    }
}
