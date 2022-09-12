//time complexity O(n*m*(n+m))*O(n*m)
class Solution {
    public void setZeroes(int[][] matrix) {
        int row=matrix.length;
        int col=matrix[0].length;
        
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(matrix[i][j]==0){
                    //pivot up
                    int idx=i-1;
                    while(idx>=0){
                        if(matrix[idx][j]!=0){
                            matrix[idx][j]=-999;
                        }
                        idx--;
                    }
                    
                    //pivot down
                    idx=i+1;
                    while(idx<row){
                        if(matrix[idx][j]!=0){
                            matrix[idx][j]=-999;
                        }
                        idx++;
                    }
                    
                    //pivot left
                    idx=j-1;
                    while(idx>=0){
                        if(matrix[i][idx]!=0){
                            matrix[i][idx]=-999;
                        }
                        idx--;
                    }
                    
                     //pivot dowm
                    idx=j+1;
                    while(idx<col){
                        if(matrix[i][idx]!=0){
                            matrix[i][idx]=-999;
                        }
                        idx++;
                    }
                }
            }
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(matrix[i][j]==-999){
                    matrix[i][j]=0;
                }
            }
        }
    }
}