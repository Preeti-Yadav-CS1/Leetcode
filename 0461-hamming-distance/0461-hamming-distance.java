class Solution {
    public int hammingDistance(int x, int y) {
        //calculate xor 
        int n= x^y;
        //count number of set bits in xor
        int set=0;
        while(n>0){
            set+=n&1;
            //right shift by 1
            n>>=1;
        }
        return set;
    }
}