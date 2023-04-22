class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result= new ArrayList<>();
        HashMap<String, ArrayList<String>> map= new HashMap<>();
        for(String str: strs){
            char[] charArr= str.toCharArray();
            Arrays.sort(charArr);
            String sorted= new String(charArr);
            
            if(map.containsKey(sorted)){
                ArrayList<String> list= map.get(sorted);
                list.add(str);
                
            }else{
                ArrayList<String> list= new ArrayList<>();
                list.add(str);
                map.put(sorted,list);
            }
        }
        
        for(Map.Entry<String, ArrayList<String>> entry: map.entrySet())        {
            result.add(entry.getValue());
        }
        return result;
    }
}