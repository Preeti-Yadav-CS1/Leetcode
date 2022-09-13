class Solution {
    public boolean isStrictlyPalindromic(int n) {
        for(int i=2;i<=n-2;i++){
            String s= get(n,i);
            if(!isPalindrome(s)){
                return false;
            }
        }
        return true;
    }
    public String get(int n, int base){
        StringBuilder str= new StringBuilder();
        while(n!=0){
            int rem= n%base;
            str.append(rem);
            n/=base;
        }
        return str.toString();
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