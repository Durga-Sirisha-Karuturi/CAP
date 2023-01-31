class Solution
{
    int count=0;
    int res=0;
    // return the Kth largest element in the given BST rooted at 'root'
    void inorder(Node node,int k){
        if(node==null){
            return ;
        }
        inorder(node.right,k);
        count+=1;
        if(count==k){
            res=node.data;
        }
        inorder(node.left,k);
    }
    public int kthLargest(Node root,int K)
    {
        //Your code here
        inorder(root,K);
        return res;
    }
}
