class Solution {
    public int minPathSum(int[][] grid) {
        int[][] dp= new int[grid.length][grid[0].length];
        for(int []a: dp)
            Arrays.fill(a,-1);
        return minPath(grid, 0,0,dp);
    }
    public static int minPath(int[][] grid, int i, int j, int[][] dp){
        if(i==grid.length-1 && j==grid[0].length-1)
            return grid[i][j];
        
        if(i>=grid.length || j>=grid[0].length)
            return Integer.MAX_VALUE;
        
        if(dp[i][j]!=-1)
            return dp[i][j];
        
        int vertical= minPath(grid, i+1, j, dp);
        int diagonal= minPath(grid, i, j+1, dp);
        return dp[i][j]= grid[i][j]+Math.min(vertical, diagonal);
    }
}