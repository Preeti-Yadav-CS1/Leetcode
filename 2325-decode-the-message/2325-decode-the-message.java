class Solution {
    public String decodeMessage(String key, String message) {
        Map<String, String> map= new HashMap<>();
        String alpha= "abcdefghijklmnopqrstuvwxyz";
        int j=0;
        int i=0;
        map.put(" "," ");
        while(i<26){
            if(map.containsKey(""+key.charAt(j))){
                j++;
                continue;
            }
            map.put(""+key.charAt(j),""+alpha.charAt(i++));
            j++;
        }
        
        String result="";
        for(i=0;i<message.length();i++){
            result+=map.get(""+message.charAt(i));
        }
        return result;
    }
}