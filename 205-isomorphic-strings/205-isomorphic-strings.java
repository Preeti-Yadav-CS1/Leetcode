class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()) return false;
        //for s
        Map<Character, Character> map= new HashMap<>();
        //set to keep track of already mapped characters
        Set<Character> set= new HashSet<>();
        for(int i=0;i<s.length();i++){
            char c1= s.charAt(i);
            char c2= t.charAt(i);
            //if c1 has encountered before
            if(map.containsKey(c1)){
                //if frist occurence is mapped to any other character then false
                if(map.get(c1)!=c2)
                    return false;
            }//c1 encountered frist time
            else{
                //already mapped
                if(set.contains(c2)) return false;
                
                //all check passed
                map.put(c1,c2);
                set.add(c2);
            }
        }
        return true;
    }
    
}