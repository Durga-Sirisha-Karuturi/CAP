public class Codec {
    public String serialize(TreeNode root) {
        if(root==null){
            return "N";
        }
        return String.valueOf(root.val)+","+serialize(root.left)+","+serialize(root.right);
    }
    int ind=0;
    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] arr=data.split(",");
        return pre(arr);
    }
    TreeNode pre(String[] arr){
        if(arr[ind].equals("N")){
            ind++;
            return null;
        }
        TreeNode node=new TreeNode(Integer.parseInt(arr[ind++]));
        node.left=pre(arr);
        node.right=pre(arr);
        return node;
    }

    // Encodes a tree to a single string.
    
}
