class Solution {
    public int characterReplacement(String s, int k) {
        int n=s.length();
        int ch[]= new int[26];
        
        int start=0;
        int end=0;
        int flip=0;
        int maxLength=0;
        
        while(end<n){
            ch[s.charAt(end)-'A']++;
            int curr_length= ch[s.charAt(end)-'A'];
            flip=Math.max(flip,curr_length);
            
            while(end-start-flip+1>k){
                ch[s.charAt(start)-'A']--;
                start++;
            }
            
            maxLength=Math.max(maxLength,end-start+1);
            end++;
        }
        return maxLength;
    }
}