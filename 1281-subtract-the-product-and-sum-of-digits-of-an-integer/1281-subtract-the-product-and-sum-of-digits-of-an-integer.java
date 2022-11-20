class Solution {
    public int subtractProductAndSum(int n) {
        int p=1;
        int s=0;
        while(n>0){
            int temp= n/10;
            p*= n-10*temp;
            s+= n-10*temp;
            n= temp;
        }
        return p-s;
    }
}