class AllElemenstinTWOBST {
    ArrayList<Integer> al = new ArrayList<>();
    public List<Integer> inorder(TreeNode root){
        if(root==null){
            return al;
        }
        inorder(root.left);
        al.add(root.val);
        inorder(root.right);
        return al;
    }
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        inorder(root1);
        inorder(root2);
        Collections.sort(al);
        return al;
    }
}