class Detectacycle{
    public boolean containsCycle(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        boolean Visited[][] = new boolean[n][m];
        int[] delrow = {-1 , 0 , 1 ,0};
        int[] delcol = {0 , 1 , 0 , -1};
        for(int i = 0 ; i < n;i++){
            for(int  j  =0 ;j< m ;j++){
                if(!Visited[i][j]){
                    if(dfs(grid , Visited , i  , j , -1 , -1, n , m , delrow , delcol , grid[i][j]))    return true;
                }
            }
        }
        return false;
    }

    public boolean dfs(char[][] grid , boolean[][] Visited , int i , int j , int parI , int parJ , int rows , int cols , int[] delrow , int[] delcol , int val){

        Visited[i][j] = true;
        for(int k = 0;k<4;k++){
            int r = i+delrow[k];
            int c = j+delcol[k];
            if(r < 0 || r>= rows || c < 0 || c>=cols|| grid[r][c] != val)   continue;
            if(Visited[r][c] && r != parI && c != parJ && grid[r][c] ==val) return true;
            if(!Visited[r][c]){
                if(dfs(grid , Visited , r ,c , i , j , rows , cols , delrow , delcol , val ))
                    return true;
            }
            
        }
        return false;
    }
}