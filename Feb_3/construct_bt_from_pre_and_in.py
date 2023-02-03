class Solution {
    TreeNode bt(int[] pre,int[] in,int ps, int pe,int is,int ie,HashMap<Integer,Integer> map){
        if(ps>pe || is>ie){
            return null;
        }
        TreeNode node=new TreeNode(pre[ps]);
        int II = map.get(pre[ps]);
        int count = II-is;
        node.left=bt(pre,in,ps+1,ps+count,is,II-1,map);
        node.right=bt(pre,in,ps+count+1,pe,II+1,ie,map);
        return node;
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }
        return bt(preorder,inorder,0,preorder.length-1,0,inorder.length-1,map);
    }
}
