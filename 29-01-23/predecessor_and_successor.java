//Geeks For Geeks

class GfG
{
    static List<Integer> arr = new ArrayList<>();
    static void inorder(Node node){
    if(node==null){
        return ;
    }
    inorder(node.left);
    arr.add(node.data);
    inorder(node.right);
    }
    public static void findPreSuc(Node root, Res p, Res s, int key)
    {
       // add your code here
       inorder(root);
       for(int i=0;i<arr.size();i++){
           if(arr.get(i)>key){
               s.succ=new Node(arr.get(i));
               break;
           }
       }

       for(int i=0;i<arr.size();i++){
           if(arr.get(i)<key){
               p.pre=new Node(arr.get(i));
           }
       }
       arr.clear();
    }
}
