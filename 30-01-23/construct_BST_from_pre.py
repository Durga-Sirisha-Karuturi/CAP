class Solution {
    TreeNode binTree(int[] pre,int upper,int[] curr){
        if(curr[0]>=pre.length){
            return null;
        }
        if(upper<pre[curr[0]]){
            return null;
        }
        TreeNode root=new TreeNode(pre[curr[0]++]);
        root.left=binTree(pre,root.val,curr);
        root.right=binTree(pre, upper,curr);
        return root;
    }
    public TreeNode bstFromPreorder(int[] preorder) {
        int upper=Integer.MAX_VALUE;
        int[] a=new int[1];
        a[0]=0;
        return binTree(preorder,upper,a);
    }
}

(or)

class Solution {
    int i=0;
    TreeNode createTree(int[] pre,int lower,int upper){
       if(i>=pre.length){
           return null;
       } 
       System.out.println(i);
       int data=pre[i];
       if(pre[i]>lower && pre[i]<upper){
           i++;
           TreeNode root=new TreeNode(data);
           root.left=createTree(pre,lower,data);
           root.right=createTree(pre,data,upper);
           return root;
       }
       return null;
    }
    public TreeNode bstFromPreorder(int[] preorder) {
        return createTree(preorder,Integer.MIN_VALUE,Integer.MAX_VALUE);
    }
}
