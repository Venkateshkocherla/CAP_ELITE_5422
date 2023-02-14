class AsfarasLandfromPossible{
    public int maxDistance(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int[][] visited = new int[n][m];
        Queue<Pair> queue = new LinkedList<>();

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                visited[i][j]=grid[i][j];
                if(grid[i][j]==1){
                    queue.add(new Pair(i,j));
                }
            }
        }
        int distance = -1;
         int[]drow = {0,-1,0,1};
        int[]dcol = {-1,0,1,0};
        while(!queue.isEmpty()){
            int qsize = queue.size();
            while(qsize-- >0){
                int r = queue.peek().row;
                int c = queue.peek().col;
                queue.remove();
                for(int i=0;i<4;i++){
                    int nrow = r+drow[i];
                    int ncol = c+dcol[i];
                    if(nrow>=0 && nrow<n && ncol>=0 && ncol<m && 
                    visited[nrow][ncol]==0){
                        queue.add(new Pair(nrow,ncol));
                        visited[nrow][ncol]=1;
                    
                    }
                }
            }

            distance++;
        }
        if(distance==0) return -1;
        return distance;       
    }
}


class Pair{
    int row;
    int col;
    Pair(int row,int col){
        this.row = row;
        this.col = col;
    }
}