class Solution {
    public String decodeString(String s) {
        Stack<Integer> stack= new Stack();
        Stack<String> result= new Stack();
        String res="";
        int i=0;
        while(i<s.length()){
            if(Character.isDigit(s.charAt(i))){
                int count=0;
                while(Character.isDigit(s.charAt(i))){
                    count=count*10+ (s.charAt(i)-'0');
                    i++;
                }
                stack.push(count);
            }else if(s.charAt(i)=='['){
                result.push(res);
                res="";
                i++;
            }else if(s.charAt(i)==']'){
                StringBuilder sb= new StringBuilder(result.pop());
                int count=stack.pop();
                for(int j=0;j<count;j++){
                    sb.append(res);
                }
                res= sb.toString();
                i++;
            }else{
                res+=s.charAt(i);
                i++;
            }
        }
        
        return res;
    }
}