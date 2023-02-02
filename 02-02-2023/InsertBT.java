class InsertBT{
    public TreeNode insertIntoBST(TreeNode root, int val) {
        TreeNode n = new TreeNode(val);
        if(root==null){
            root = n;
            return root;
        }
        if(val<root.val)
        {
            root.left=insertIntoBST(root.left,val);
        }
        else
        {
            root.right=insertIntoBST(root.right,val);
        }
        return root;

    }
}