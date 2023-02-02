class LowestCommonAncestor{
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        while(root!=null){
            if(p.val>root.val&&root.val<q.val){
                root = root.right;
            }
            else if(p.val<root.val&&q.val<root.val){
                root = root.left;
            }
            else if(p.val<root.val&&q.val>root.val){
                return root;
            }
            else if(p.val>root.val&&q.val<root.val){
                return root;
            }
            if(p.val==root.val||q.val==root.val){
                return root;
            }
            
        }
        return root;
    }
}