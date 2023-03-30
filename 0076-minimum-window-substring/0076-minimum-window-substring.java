class Solution {
    public String minWindow(String s, String t) {
        String ans="";
        HashMap<Character,Integer> map= new HashMap<>();
        for(int i=0;i<t.length();i++){
            char ch = t.charAt(i);
            map.put(ch, map.getOrDefault(ch,0)+1);
        }
        
        int i=0;
        int j=0;
        int count=0;
        HashMap<Character,Integer> map2= new HashMap<>();
        while(true){
            boolean flag1=false,flag2=false;
            //increment ans bnane 
            while(j<s.length() && count<t.length()){
                char ch= s.charAt(j);
                map2.put(ch,map2.getOrDefault(ch,0)+1);

                if(map2.getOrDefault(ch,0)<=map.getOrDefault(ch,0)){
                    count++;
                }
                flag1=true;
                j++;
            }
            //collect and release
            while(i<j && count==t.length()){
                //collect
                String possibleAns= s.substring(i,j);
                if(ans.length()==0 || possibleAns.length()<ans.length())
                    ans= possibleAns;
                
                //release
                
                char ch= s.charAt(i);
                if(map2.get(ch)==1)
                    map2.remove(ch);
                else 
                    map2.put(ch, map2.get(ch)-1);
                
                if(map2.getOrDefault(ch,0)< map.getOrDefault(ch,0))
                    count--;
                flag2=true;
                i++;
            }
            if(flag1==false && flag2==false)
                break;
        }
        return ans;
    }
}