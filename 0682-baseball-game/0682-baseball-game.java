class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack= new Stack<>();
        for(String op: operations){
            if(op.equals("+")){
                int top= stack.pop();
                int newTop= top+stack.peek();
                stack.add(top);
                stack.add(newTop);
            }else if(op.equals("C")){
                stack.pop();
            }else if(op.equals("D")){
                stack.add(stack.peek()*2);
            }else{
                stack.add(Integer.valueOf(op));
            }
        }
        int sum=0;
        for(int s:stack){
            sum+=s;
        }
        return sum;
    }
}