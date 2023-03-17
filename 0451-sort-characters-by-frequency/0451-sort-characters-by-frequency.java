class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> map= new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch= s.charAt(i);
            map.put(ch, map.getOrDefault(ch,0)+1);
        }
        
        
        PriorityQueue<Map.Entry<Character,Integer>>pq=
            new PriorityQueue<>((a,b)-> a.getValue()==b.getValue()? a.getKey()-b.getKey()
                                : b.getValue()-a.getValue());
        
        for(Map.Entry<Character,Integer> e: map.entrySet())
            pq.add(e);
        
        StringBuilder sb= new StringBuilder();
        
        while(pq.size()!=0){
            char ch= pq.poll().getKey();
            int value= map.get(ch);
            
            while(value!=0){
                sb.append(ch);
                value--;
            }
        }
        
        return sb.toString();
    }
}