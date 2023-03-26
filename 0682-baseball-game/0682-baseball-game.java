class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack= new Stack<>();
        for(String ch:operations){
            if(ch.equals("+")){
                int x=stack.pop();
                int y= stack.peek();
                stack.push(x);
                stack.push(x+y);
            }else if(ch.equals("C")){
                stack.pop();
            }else if(ch.equals("D")){
                stack.push(stack.peek()*2);
            }else{
                stack.push(Integer.valueOf(ch));
            }
        }
        int res=0;
        for(int val:stack)
            res+=val;
        return res;
    }
}