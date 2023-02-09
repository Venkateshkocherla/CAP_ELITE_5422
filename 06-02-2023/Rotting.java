class Rotting{
    public int orangesRotting(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int [][] visited = new int[n][m];
        Queue <Pair> q = new LinkedList<>();
        int cntFresh = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==2){
                    q.add(new Pair(i,j,0));
                    visited[i][j]=2;
                }
                else{
                    visited[i][j]=0;
                }
                if (grid[i][j] == 1) cntFresh++;
            }
        }
        int row[] = {-1, 0, +1, 0};
        int col[] = {0, 1, 0, -1};
        int time = 0;
        int cnt = 0;
        while(!q.isEmpty()){
            int r = q.peek().row;
            int c = q.peek().col;
            int t = q.peek().time;
            time = Math.max(time,t);
            q.remove();
            for(int i =0;i<4;i++){
                int nrow = r + row[i];
                int ncol = c + col[i];

        if (nrow >= 0 && nrow < n && ncol >= 0 && ncol < m &&
          visited[nrow][ncol] == 0 && grid[nrow][ncol] == 1) {
                q.add(new Pair(nrow, ncol, t + 1));
                visited[nrow][ncol] = 2;
                cnt++;
            }
           
        }

    }
    if (cnt != cntFresh) return -1;
    return time;
}
}
class Pair{
    int row;
    int col;
    int time;
    public Pair(int row,int col,int time){
        this.row = row;
        this.col = col;
        this.time = time;
    }
}