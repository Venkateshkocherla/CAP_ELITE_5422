class Keysandrooms{
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        Queue<Integer> queue = new LinkedList<>();
        boolean [] vis = new boolean[rooms.size()];
        queue.add(0);
        vis[0]=true;
        while(!queue.isEmpty()){
            int curr = queue.poll();
            for(int i:rooms.get(curr)){
                if(!vis[i]){
                    vis[i]=true;
                    queue.add(i);
                }
            }
        }
        for(int j=0;j<vis.length;j++){
            if(vis[j]==false){
                return false;
            }
        }
        return true;

    }
}