class Solution {
    public String reverseWords(String s) {
        String after = s.trim().replaceAll(" +", " ");
        s=new String(after.trim());
        // int n= after.length();
        // String result="";
        // int store=n;
        // for(int i=n-1;i>=0;i--){
        //     if(s.charAt(i)==' '){
        //     ans= after.substring(i,store);
        //     store=i;
        //     result+=ans;
        //     }else if(i==0){
        //         ans= after.substring(0,store);
        //         result+=" ";
        //         result+=ans;
        //     }
        // }
        
        int n= s.length();
        // System.out.println(n);
        int store=n;
        String res="";
        
        for(int i=n-1;i>=0;i--){
            String ans="";
            if(s.charAt(i)==' '){
                ans= s.substring(i,store);
                res+=ans;
                store=i;
            }else{
                if(i==0){
                    ans=" ";
                    ans+=s.substring(i,store);
                    
                    res+=ans;
                }
                
            }
        }
        return res.trim();
    }
}