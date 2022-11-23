class Solution {
    public String decodeString(String s) {
        Stack<Integer> counts= new Stack();
        Stack<String> result= new Stack();
        String res= "";
        int i=0;
        while(i<s.length()){
            if(Character.isDigit(s.charAt(i))){
                int count=0;
                while(Character.isDigit(s.charAt(i))){
                    count=10*count+(s.charAt(i)-'0');
                    i++;
                }
                counts.push(count);
            }else if(s.charAt(i)=='['){
                result.push(res);
                res="";
                i++;
            }else if(s.charAt(i)==']'){
                StringBuilder str= new StringBuilder(result.pop());
                int count= counts.pop();
                for(int j=0;j<count;j++){
                    str.append(res);
                }
                res=str.toString();
                i++;
            }else{
                res+=s.charAt(i);
                i++;
            }
        }
        return res;
    }
}