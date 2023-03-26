class Solution {
    public String removeKdigits(String num, int k) {
        if(k>=num.length())
            return "0";
        
        else if(k==0)
            return num;
        
        Stack<Character> stack= new Stack();
        StringBuilder res= new StringBuilder();
        
        for(char ch: num.toCharArray()){
            while(stack.size()>0 && k>0 && stack.peek()>ch){
                stack.pop();
                k--;
            }
            if(stack.size()!=0 || ch!='0')
                stack.push(ch);
        }
        
        while(k>0 && stack.size()>0){
            k--;
            stack.pop();
        }
        
        if(stack.size()==0)
            return "0";
        
        for(char ch:stack)
            res.append(ch);
        
        return res.toString();
    }
}