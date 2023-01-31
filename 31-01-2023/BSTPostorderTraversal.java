class BSTPostorderTraversal {
    ArrayList<Integer> al = new ArrayList<Integer>();
    public List<Integer> postorderTraversal(TreeNode root) {
        if(root==null){
            return al;
        }
        postorderTraversal(root.left);
        postorderTraversal(root.right);
        al.add(root.val);
        return al;
    }
}