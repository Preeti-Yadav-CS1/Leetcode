class Solution {
    public int hammingDistance(int x, int y) {
        // calculate xor of two number
        int xor= x ^ y;
        
        int setBit=0;
        //caculate number of set bits
        while(xor>0){
            setBit+=(xor&1);
            xor>>=1;
        }
        
        return setBit;
    }
}