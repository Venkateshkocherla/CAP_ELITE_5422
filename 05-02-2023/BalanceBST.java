 class BalanceBST{
    List<TreeNode> sorted = new ArrayList<>();
    
    public TreeNode balanceBST(TreeNode root) {
        inorder(root);
        return createBST(0, sorted.size() - 1);
    }
    
    public void inorder(TreeNode node) {
        if(node == null) {
            return;
        }
        inorder(node.left);
       sorted.add(node);
        inorder(node.right);
    }
    
    public TreeNode createBST(int left, int right) {
        if(left > right) {
            return null;
        }
        
        int mid = (left + right) / 2;
        TreeNode curr = sorted.get(mid);
        curr.left = createBST(left, mid - 1);
        curr.right = createBST(mid + 1, right);
        
        return curr;
    }
}