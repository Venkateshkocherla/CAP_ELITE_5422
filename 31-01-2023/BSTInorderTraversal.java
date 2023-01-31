class BSTInorderTraversal{
    ArrayList<Integer> al = new ArrayList<Integer>();
    public List<Integer> inorderTraversal(TreeNode root) {
         if(root==null){
             return al;
         }
         inorderTraversal(root.left);
         al.add(root.val);
         inorderTraversal(root.right);
         return al;
    }
}