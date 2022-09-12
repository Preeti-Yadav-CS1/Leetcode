class Solution {
    public int lengthOfLongestSubstring(String s) {
        int start=0;
        int end=0;
        int max=0;
        
        HashSet<Character> newHash= new HashSet<>();
        while(end<s.length()){
            if(!newHash.contains(s.charAt(end))){
                newHash.add(s.charAt(end));
                end++;
                max=Math.max(max, newHash.size());
            }else{
                newHash.remove(s.charAt(start));
                start++;
            }
        }
        return max;
    }
}