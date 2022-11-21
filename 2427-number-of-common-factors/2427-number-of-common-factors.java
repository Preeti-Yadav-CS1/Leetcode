class Solution {
    public int commonFactors(int a, int b) {
        int count=0;
        for(int i=1;i<=b;i++){
            if(b%i==0 && a%i==0) count++;
        }
        return count;
    }
}