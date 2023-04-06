class Solution {
    public int closedIsland(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        boolean[][] visited= new boolean[m][n];
          
        int count=0;
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==0 && !visited[i][j] && dfs(i, j, m, n, grid, visited)){
                    count++;
                }
            }
        }
        
        return count;
    }
    
    public boolean dfs(int x, int y, int r, int c, int[][]grid, boolean[][] visited){
        if(x<0 || x>=r || y<0 || y>=c)
            return false;
        
        if(grid[x][y]==1 || visited[x][y]){
            return true;
        }
        
        visited[x][y]= true;
        boolean closed= true;
        
        int[] dirx = {0, 1, 0, -1};
        int[] diry = {-1, 0, 1, 0};
        
        for(int i=0;i<4;i++){
            int temp1= x+dirx[i];
            int temp2= y+diry[i];
            
            if(!dfs(temp1, temp2, r,c, grid, visited))
                closed= false;
        }
        
        return closed;
    }
}