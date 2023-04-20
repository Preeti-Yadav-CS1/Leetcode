class Solution {
    public int minFallingPathSum(int[][] arr) {
        int[][] dp= new int[arr.length][arr[0].length];
        for(int [] a: dp)
            Arrays.fill(a,-1);
         
        int result=Integer.MAX_VALUE;
        for(int i=0;i<arr[0].length;i++){
            result=Math.min(result,minFallingPath(arr, 0 , i, dp));
        } 
        return result;
    }
    private static int minFallingPath(int[][] matrix, int row, int col, int[][] dp) {
		// TODO Auto-generated method stub

		if (col < 0 || col >= matrix[0].length) {
			return Integer.MAX_VALUE;
		}
		if (row == matrix.length - 1) {
			return matrix[row][col];

		}

		if (dp[row][col] != -1) {
			return dp[row][col];
		}

		int cost = Integer.MAX_VALUE;
		for (int i = 0; i < matrix[0].length; i++) {
			if (i != col) {
				cost = Math.min(cost, minFallingPath(matrix, row + 1, i, dp));
			}
		}

		return dp[row][col] = matrix[row][col] + cost;
	}
}