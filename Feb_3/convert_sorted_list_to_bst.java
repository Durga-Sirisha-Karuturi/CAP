class Solution {
    List<Integer> arr=new ArrayList<>();
    void toArr(ListNode head){
        while(head!=null){
            arr.add(head.val);
            head=head.next;
        }
        return;
    }
    TreeNode bst(List<Integer> l,int start,int end){
        if(start>end){
            return null;
        }
        int mid=(start+end)/2;
        TreeNode node=new TreeNode(l.get(mid));
        node.left=bst(l,start,mid-1);
        node.right = bst(l,mid+1,end);
        return node;
    }
    public TreeNode sortedListToBST(ListNode head) {
        toArr(head);
        return bst(arr,0,arr.size()-1);
    }
}
