class Solution {
    public int partitionString(String s) {
        HashSet<Character> visited= new HashSet<>();
        int count=1;
        for(int i=0;i<s.length();i++){
            if(visited.contains(s.charAt(i))){
                count++;
                visited.clear();
            }
            
            visited.add(s.charAt(i));
        }
        
        return count;
    }
}