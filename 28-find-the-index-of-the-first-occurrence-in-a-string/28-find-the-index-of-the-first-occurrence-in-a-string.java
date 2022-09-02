class Solution {
    public int strStr(String haystack, String needle) {
        
        int index= haystack.indexOf(needle);
        return index;
    }
}

//Approach 2:
class Solution {
    public int strStr(String haystack, String needle) {
        for(int i=0; i<haystack.length();i++){
            int n=0;
            while(n+i<haystack.length() && n< needle.length() && haystack.charAt(i+n)==needle.charAt(n)){
                n++;
            }
            if(n==needle.length()) return i;
        }
        return -1;
    }
}
