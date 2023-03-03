class Solution {
    public int strStr(String haystack, String needle) {
        if(haystack==null|| needle==null)
            return -1;

        int l1= haystack.length();
        int l2= needle.length();
        for(int i=0;i<l1-l2+1;i++){
            int count=0;
            int j=i;
            while(count<l2 && haystack.charAt(j)== needle.charAt(count)){
                count++;
                j++;
            }
            if(count==l2){
                return i;
            }
        }
        return -1;
    }
}