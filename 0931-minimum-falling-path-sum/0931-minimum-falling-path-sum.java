class Solution {
    public int minFallingPathSum(int[][] arr) {
        int[][] dp= new int[arr.length][arr[0].length];
        for(int a[]: dp)
            Arrays.fill(a,-1);
        int result=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            result=Math.min(result,fallingPathSum(arr, 0 , i,dp));
        }
        return result;
    }
    public static int fallingPathSum(int[][] arr, int i, int j, int[][] dp){
        if(j<0 ||j>=arr[0].length)
            return Integer.MAX_VALUE;

        if(i==arr.length-1)
            return arr[i][j];

        if(dp[i][j]!=-1)
            return dp[i][j];
        
        int a= fallingPathSum(arr, i+1, j-1, dp);
        int b= fallingPathSum(arr, i+1, j, dp);
        int c= fallingPathSum(arr, i+1, j+1, dp);
        return dp[i][j] = arr[i][j]+Math.min(a, Math.min(b,c));
    }
}