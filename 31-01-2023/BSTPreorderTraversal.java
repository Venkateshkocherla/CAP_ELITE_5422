class BSTPreorderTraversal {
    ArrayList<Integer> al = new ArrayList<Integer>();
    public List<Integer> preorderTraversal(TreeNode root) {
        if(root==null){
            return al;
        }
        al.add(root.val);
        preorderTraversal(root.left);
        preorderTraversal(root.right);
        return al;
    }
}