//time complexity O(n*m)+O(n*m)
//optimized approach
class Solution {
    public void setZeroes(int[][] matrix) {
        int row=matrix.length;
        int col=matrix[0].length;
        
        int rowTraverse[]= new int[row];
        int colTraverse[]= new int[col];
        
        Arrays.fill(rowTraverse,-1);
        Arrays.fill(colTraverse,-1);
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(matrix[i][j]==0){
                    rowTraverse[i]= 0;
                    colTraverse[j]=0;
                }
            }
        }
        
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(rowTraverse[i]==0||colTraverse[j]==0)
                    matrix[i][j]=0;
            }
        }
    }
}
