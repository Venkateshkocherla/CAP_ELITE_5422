class RangeSumBT{
    int sum = 0;
    public int rangeSumBST(TreeNode root, int low, int high) {
        if(root==null){
            return sum;
        }
        if(root.val>=low && root.val<=high){
            sum+=root.val;
        }
        if(low<root.val){
            rangeSumBST(root.left,low,high);
        }
        if(root.val<high){
            rangeSumBST(root.right,low,high);
        }
        return sum;
        
    }
}