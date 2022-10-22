class Solution {
    public List<String> generateParenthesis(int n) {
        List ans= new ArrayList<String>();
        paranthesis(ans,"",0,0,n);
        return ans;
    }
    public void paranthesis(List<String> ans, String result,int open,int close, int n){
        if(open==n && close==n){
            ans.add(result);
            return;
        }
        
        
        if(open<n)
            paranthesis(ans, result+"(", open+1, close, n);
        if(close<open)
            paranthesis(ans, result+")", open, close+1, n);
    }
}