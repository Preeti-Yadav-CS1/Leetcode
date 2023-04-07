class Solution {
    public int numEnclaves(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        
        
        //remove all the lands connected with edge
        
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(i*j == 0 || i == row-1|| j == col-1){
                    if(grid[i][j]==1)
                        dfs(grid, i,j);
                }
            }
        }
        
        int ans=0;
        for(int[] rows: grid){
            ans+=Arrays.stream(rows).sum();
        }
        
        return ans;
    }
    
    public void dfs(int[][] grid, int i, int j){
        if(i<0 || i==grid.length || j==grid[0].length || j<0)
            return;
        
        if(grid[i][j]==0)
            return;
        
        grid[i][j]=0;
        dfs(grid, i+1, j);
        dfs(grid, i-1, j);
        dfs(grid, i, j-1);
        dfs(grid, i, j+1);
    }
}