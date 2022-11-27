class Solution {
    public int coinChange(int[] coins, int amount) {
        //check edge case:
        if(amount<1) 
            return 0;
        
        //create dp array
        int[] mincoinDp= new int[amount+1];
        
        for(int i=1; i<=amount; i++){
            
            mincoinDp[i]= Integer.MAX_VALUE;
            
            //try ecah coin
            for(int coin: coins){
                
                // particular coin should be less than choose to be amount
                // and we should have checked the pervious value with there min value
                
                if(coin<=i && mincoinDp[i-coin]!= Integer.MAX_VALUE){
                    mincoinDp[i]= Math.min(mincoinDp[i], mincoinDp[i-coin]+1);
                }
            }
        }
        
        if(mincoinDp[amount]== Integer.MAX_VALUE){
            return -1;
        }
        return mincoinDp[amount];
    }
}