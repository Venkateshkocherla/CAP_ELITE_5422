class FloodFill{
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int n = image.length;
        int m = image[0].length;
        int value = image[sr][sc];
        int [][] visited = image;
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(sr,sc));
        while(!q.isEmpty()){
            int r = q.peek().row;
            int c = q.peek().col;
            q.remove();
            int [] drow = {0,0,1,0,-1};
            int [] dcol = {0,1,0,-1,0};
             for(int i = 0; i<5;i++) {
                    int nrow = r + drow[i];
                    int ncol = c + dcol[i];                
                        if(nrow >= 0 && nrow < n && ncol >= 0 && ncol < m 
                        && image[nrow][ncol]!=color && image[nrow][ncol]==value) {
                            image[nrow][ncol] = color; 
                            q.add(new Pair(nrow, ncol)); 
                        }
            }      
        }
        return image;
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