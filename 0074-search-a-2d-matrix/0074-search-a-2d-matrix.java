class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row= matrix.length-1; int col=0;
        
        //frist row last column
        while(row>=0 && col<matrix[0].length){
            if(matrix[row][col]==target) return true;
            
            //if key is small move left
            else if(target< matrix[row][col])
                 row--;
            // if key is larger than cell value move down
            else 
                col++;
        }
        return false;
    }
}