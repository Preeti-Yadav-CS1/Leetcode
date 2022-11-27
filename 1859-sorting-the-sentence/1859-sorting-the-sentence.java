class Solution {
    public String sortSentence(String s) {
        //Map to store the words in correct format'
        Map<Integer, String> indexWordMap= new HashMap<>();
        
        //split each word based on space
        for(String word: s.split(" ")){
            int lastIndex= word.length()-1;
            
            //get the actual word and index
            
            int actualPosition= word.charAt(lastIndex)-'0';
            String actualWord= word.substring(0, lastIndex);
            indexWordMap.put(actualPosition, actualWord);
            
        }
        
        //build actual string
        
        StringBuilder actualString= new StringBuilder();
        
        for(Map.Entry<Integer, String> indexWord: indexWordMap.entrySet()){
            actualString.append(indexWord.getValue());
            actualString.append(" ");
        }
        
        return actualString.toString().trim();
    }
}