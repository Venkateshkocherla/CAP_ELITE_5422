class NoofIslands{
    public int numIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int [][] visited = new int[n][m];
        Queue<Pair> q = new LinkedList<>();
        int cnt = 0;
        for(int row = 0; row < n ; row++) {
            for(int col = 0; col < m ;col++) {
                if(visited[row][col] == 0 && grid[row][col] == '1') {
                    cnt++;
                    q.add(new Pair(row,col));
                    while(!q.isEmpty()){
                        int r = q.peek().row;
                        int c = q.peek().col;
                        q.remove();
                        int [] drow = {0,1,0,-1};
                        int [] dcol = {1,0,-1,0};
                        for(int i = 0; i<4;i++) {
                            int nrow = r + drow[i];
                            int ncol = c + dcol[i];                
                            if(nrow >= 0 && nrow < n && ncol >= 0 && ncol < m 
                            && grid[nrow][ncol] == '1' && visited[nrow][ncol] == 0) {
                                visited[nrow][ncol] = 1; 
                                q.add(new Pair(nrow, ncol)); 
                                }
                        }

                        
                    } 
                }
            }
        }
        return cnt;
        
    }
}  
    class Pair{
    int row;
    int col;
    public Pair(int row,int col){
        this.row = row;
        this.col = col;
    }
}