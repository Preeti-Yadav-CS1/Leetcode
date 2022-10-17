class Solution {
    public void rotate(int[][] matrix) {
        int n=matrix.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                int temp= matrix[i][j];
                matrix[i][j]= matrix[j][i];
                matrix[j][i]= temp;
            }
        }
        
        for(int i=0;i<n;i++){
            int s=0;
            int end=n-1;
            while(s<end){
                int temp= matrix[i][s];
                matrix[i][s]= matrix[i][end];
                matrix[i][end]= temp;
                s++;end--;
            }
        }
        
    }
}