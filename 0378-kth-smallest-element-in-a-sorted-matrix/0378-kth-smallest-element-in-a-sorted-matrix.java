class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int []arr= new int[matrix[0].length* matrix.length];
        int idx=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                arr[idx]= matrix[i][j];
                idx++;
            }
        }
        Arrays.sort(arr);
        return arr[k-1];
    }
}