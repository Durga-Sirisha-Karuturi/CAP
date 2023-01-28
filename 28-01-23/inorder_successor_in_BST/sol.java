//User function Template for Java

/*Complete the function below
Node is as follows:
class Node{
	int data;
	Node left,right;
	Node(int d){
		data=d;
		left=right=null;
	}
}
*/
class Solution
{
    List<Integer> arr=new ArrayList<>();
    void inorder(Node node){
        if(node==null){
            return ;
        }
        inorder(node.left);
        arr.add(node.data);
        inorder(node.right);
    }
    // returns the inorder successor of the Node x in BST (rooted at 'root')
	public Node inorderSuccessor(Node root,Node x)
         {
          //add code here.
          inorder(root);
          Node req=null;
          for(int i=0;i<arr.size();i++){
              if(arr.get(i)>x.data){
                  req=new Node(arr.get(i));
                  break;
              }
          }
          return req;
         }
}
