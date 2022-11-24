class Solution {
    public String simplifyPath(String path) {
        Stack<String> stack= new Stack();
        String result= "";
        result+="/";
        
        int len= path.length();
        
        //compress
        for(int i=0;i<len;i++){
            String res="";
            while(i<len && path.charAt(i)=='/'){
                i++;
            }while(i<len && path.charAt(i)!='/' ){
                res+=path.charAt(i);
                i++;
            }
            
            if(res.equals("..")==true){
                if(!stack.empty()){
                    stack.pop();
                }
            }
            else if(res.equals(".")==true){
                continue;
            }else if(res.length()!=0){
                stack.push(res);
            }
        }
        
        
        //result
        
        Stack<String> st= new Stack();
        while(!stack.empty()){
            st.push(stack.pop());
        }
        
        while(!st.isEmpty()){
            if(st.size()!=1){
                result+=(st.pop()+'/');
            }else{
                result+=st.pop();
            }
        }
        
        return result;
    }
}