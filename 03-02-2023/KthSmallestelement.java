class KthSmallestelement{int count = 0;
    public int kthSmallest(TreeNode root, int k) {
        if(root==null){
            return 0;
        }
        int left = kthSmallest(root.left,k);
        count++;
        if(count==k){
            return root.val;
        }
        int right = kthSmallest(root.right,k);
        if(left!=0){
            return left;
        }
        if(right!=0){
            return right;
        }
        return 0;
    }
}