class Solution {
    public int longestPalindrome(String s) {
        int[] ch=new int[128];
        for(char c: s.toCharArray()){
            ch[c]++;
        }
        
        int ans=0;
        boolean odd= false;
        for(int i: ch){
            if(i%2==0){
                ans+=i;
            }else{
                odd=true;
                ans+=i-1;
            }
        }
        if(!odd){
            return ans;
        }
        return ans+1;
    }
}