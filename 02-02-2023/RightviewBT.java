class RightviewBT{
    public List<Integer> rightSideView(TreeNode root) {
    ArrayList<Integer>result= new ArrayList<>();
    rightview(root,result,0);
    return result;
   
}
   
   public void rightview(TreeNode root, ArrayList<Integer>result,int level){
       if(root==null){
       return ;}
       
       if(level==result.size()){
           result.add(root.val);
       }
   rightview(root.right,result,level+1);
   rightview(root.left,result,level+1);
    }
}