void decode(String s, Node root) {
        StringBuilder res=new StringBuilder();
        Node cur=root;
        while(s.length()>0){
            char f=s.charAt(0);
            if(f=='1'){
                cur=cur.right;
            }
            else{
                cur=cur.left;
            }
            s=s.substring(1);
            if(cur.left==null && cur.right==null){
                res.append(cur.data);
                cur=root;
            }
        }
        System.out.println(res.toString());
    }
