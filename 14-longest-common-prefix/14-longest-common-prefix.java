class Solution {
    public String longestCommonPrefix(String[] str) {
        //approach 1 by sorting
        //base case 
        if(str.length==0) return "";
        if(str.length==1) return str[0];
        
        //sort the array
        Arrays.sort(str);
        int end=Math.min(str[0].length(), str[str.length-1].length());
        
        int i=0;
        while(i<end && str[0].charAt(i)==str[str.length-1].charAt(i)){
            i++;
        }
        
        String prefix=str[0].substring(0,i);
        return prefix;
    }
}