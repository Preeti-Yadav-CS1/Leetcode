class Solution {
    public int longestPalindrome(String s) {
        Map<Character, Integer> map= new HashMap<>();
        char[] ch=s.toCharArray();
        for(int i=0; i<s.length(); i++){
            if(map.containsKey(ch[i]))
                map.put(ch[i], map.get(ch[i]) + 1);
            else
                map.put(ch[i], 1);
        }
        
        int ans=0;
        boolean odd= false;
        for(int i: map.values()){
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