class Solution {
    public int maximumRemovals(String s, String p, int[] removable) {
        int left=0;
        int right= removable.length-1;
        while(left<=right){
            int mid= left+(right-left)/2;
            StringBuffer buffer= new StringBuffer(s);
            for(int i=0;i<=mid;i++){
                buffer.setCharAt(removable[i],' ');
            }
            
            if(issubsequence(buffer.toString(), p)){
                left= mid+1;
            }else{
                right=mid-1;
            }   
        }
        return right+1;
    }
    public static boolean issubsequence(String s2, String s1)
    {
        int n = s1.length(), m = s2.length();
        int i = 0, j = 0;
        while (i < n && j < m) {
            if (s1.charAt(i) == s2.charAt(j))
                i++;
            j++;
        }
        /*If i reaches end of s1,that mean we found all
        characters of s1 in s2,
        so s1 is subsequence of s2, else not*/
        return i == n;
    }
}