class Solution {
    public boolean isUgly(int n) {
        if(n<=0)
            return false;
        
        int[] factors={2,3,5};
        
        for(int i: factors){
            n= divide(n,i);
        }
        
        return n==1;
    }
    
    public int divide(int n, int i){
        while(n%i==0){
            n=n/i;
            
        }
        return n;
    }
}