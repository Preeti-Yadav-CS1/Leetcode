class Solution {
    public int[][] generateMatrix(int n) {
        int [][] outputMatrix= new int[n][n];
        int count=1;
        int startRow=0;
        int startCol=0;
        int endRow= n-1;
        int endCol= n-1;
        
        while(count<=n*n){
            //top boundary
            for(int col=startCol; col<=endCol;col++){
                
                outputMatrix[startRow][col]=count;
                count++;
                
            }
            
            //right boundary
            for(int row= startRow+1; row<=endRow;row++){
                outputMatrix[row][endCol]=count;
                count++;
                
            }
            
            //bottom boundary
            for(int col= endCol-1; col>=startCol;col--){
                    if(startRow==endRow) break;
                    outputMatrix[endRow][col]=count;
                    count++;    
            }
            
            //left boundary
            for(int row= endRow-1; row>=startRow+1;row--){
                if(startCol==endCol) break;
                outputMatrix[row][startCol]=count;
                count++;
            }
            startCol++;
            startRow++;
            endCol--;
            endRow--;
            
        }
        return outputMatrix;
    }
}