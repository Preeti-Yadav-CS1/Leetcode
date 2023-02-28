class Solution {
    public int alternateDigitSum(int n) {
        int sum=0;
        String s= String.valueOf(n);
        for(int i=0;i<s.length();i++){
            char ch= s.charAt(i);
            if(i%2==0){
                sum+=(ch-'0');
            }else{
                sum-=(ch-'0');
            }
        }
        return sum;
    }
}