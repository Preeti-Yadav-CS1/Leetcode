class Solution {
    
    public int minDistance(String word1, String word2) {
        // return operation(word1, word2,0,0);
        int[][] dp= new int[word1.length()][word2.length()];
        for(int []a: dp)
            Arrays.fill(a,-1);
        return operationBU(word1, word2, 0,0, dp);
    }
    public static int operationBU(String word1, String word2, int i, int j, int[][] dp){
        if(i == word1.length())
            return word2.length()-j;
        
        if(j == word2.length())
            return word1.length()-i;
        
        if(dp[i][j]!=-1)
            return dp[i][j];
        
        int ans=0;
        if(word1.charAt(i)== word2.charAt(j)){
            ans = operationBU(word1, word2, i+1, j+1, dp);
        }else{
            int insert= operationBU(word1, word2, i, j+1, dp);
            int delete= operationBU(word1, word2, i+1, j, dp);
            int replace= operationBU(word1, word2, i+1, j+1, dp);
            ans = Math.min(insert, Math.min(delete, replace))+1;
        }
        return dp[i][j]= ans;
    }
    
    
    
    
    
    // public static int operation(String word1, String word2, int word1Index, int word2Index){
    //     if(word1Index==word1.length()){
    //         return word2.length()-word2Index;
    //     }
    //     if(word2Index==word2.length()){
    //         return word1.length()-word1Index;
    //     }
    //     int ans=0;
        // if(word1.charAt(word1Index)== word2.charAt(word2Index)){
        //     ans+=operation(word1, word2, word1Index+1, word2Index+1);
        // }else{
        //     int insert= operation(word1, word2, word1Index+1, word2Index+1);
        //     int delete= operation(word1, word2, word1Index+1, word2Index);
        //     int replace= operation(word1, word2, word1Index+1, word2Index+1);
        //     ans+=Math.min(insert, Math.min(delete, replace))+1;
        // }
    //     return ans;
    // }
}