class Solution {
    public String breakPalindrome(String palindrome) {
        char[] charArray= palindrome.toCharArray();
        int n= palindrome.length();
        
        for(int i=0;i<n/2;i++){
            if(charArray[i]!='a'){
                charArray[i]='a';
                return String.valueOf(charArray);
            }
        }
        if(charArray[n-1]!='b')
            charArray[n-1]='b';
        
        return n<2 ? "" : String.valueOf(charArray);
    }
}