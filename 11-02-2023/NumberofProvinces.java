class NumberofProvinces{
    public int findCircleNum(int[][] isConnected) {
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        int n = isConnected.length;
        int m  = isConnected[0].length;
        for(int i = 0 ;i<n ;i++ ){
            graph.add(new ArrayList<>());
            for(int j = 0 ; j< m ;j++){
                if(isConnected[i][j] == 1){  
                    graph.get(i).add(j);
                }
            }
        }
        int Provinces = 0;
        boolean Visited[] = new boolean[n];
        for(int i = 0 ;i<n;i++){
            if(!Visited[i] && graph.get(i).size() != 0){
                Provinces++;
                dfs(graph , i , Visited);
            }
        }
        return Provinces;
    }

    public void dfs(ArrayList<ArrayList<Integer>> graph , int curr , boolean[] Visited){
        Visited[curr] = true;
        for(int i = 0 ;i< graph.get(curr).size();i++){
            int val = graph.get(curr).get(i);
            if(!Visited[val]){
                dfs(graph , val, Visited);
            }
        }
        return;
    }
}