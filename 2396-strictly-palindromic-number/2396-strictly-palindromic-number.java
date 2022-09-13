class Solution {
    public boolean isStrictlyPalindromic(int n) {
        boolean check= true;
        for(int i=2;i<=n-2;i++){
            String s= get(n,i);
            if(!isPalindrome(s)){
                check=false;
                break;
            }
        }
        return check;
    }
    public String get(int n, int base){
        String s="";
        while(n!=0){
            if(n%base!=0){
                int rem= n%base;
                s+=rem+'0';
                n/=base;
            }else{
                s+='0';
                n/=base;
            }
        }
        return s;
    }
    
    public static boolean isPalindrome(String str) {
        int left = 0, right = str.length() - 1;
        
        while(left < right)
        {
            if(str.charAt(left) != str.charAt(right))
            {
                return false;
            }
            left++;
            right--;
        }
        return true;
    } 
}