class RecoverBST{
    TreeNode prev = new TreeNode(Integer.MIN_VALUE);
    TreeNode first = null;
    TreeNode middle = null;
    TreeNode last = null;

    public void inorder(TreeNode root){
        if(root==null){
            return;
        }
        inorder(root.left);
        if(root==null){
            return ;
        }
        if(prev!=null&&root.val<prev.val){
            if(first==null){
                first = prev;
                middle = root;
            }
            else{
                last = root;
            }
        }
        prev = root;
        inorder(root.right);
    }
    public void recoverTree(TreeNode root) {
        inorder(root);
        if(first!=null&&last!=null){
            int value = first.val;
            first.val = last.val;
            last.val = value;
        }
        else if(first!=null&&middle!=null){
            int valu = first.val;
            first.val = middle.val;
            middle.val = valu;
        }
       
    }
}