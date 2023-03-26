class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder sb= new StringBuilder();
        int opened=0;
        for(char ch: s.toCharArray()){
            if(ch=='('){
                if(opened>0)
                    sb.append(ch);
                opened++;
            }
            else{
                if(opened>1)
                    sb.append(ch);
                opened--;
            }
        }
        return sb.toString();
    }
}