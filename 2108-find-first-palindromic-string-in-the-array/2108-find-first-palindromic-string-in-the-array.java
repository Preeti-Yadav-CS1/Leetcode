class Solution {
    public String firstPalindrome(String[] words) {
        for(int k=0;k<words.length;k++){
            int i=0;
            String str= words[k];
            int j= str.length()-1;
            while(i<j){
                if(str.charAt(i)!= str.charAt(j)){
                    break;
                }
                i++;
                j--;
            }
            if(i>=j){
                return str;
            }
        }
        return "";
    }
}