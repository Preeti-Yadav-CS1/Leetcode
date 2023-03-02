class Solution {
    public int compress(char[] chars) {
        StringBuilder sb= new StringBuilder();
        int n= chars.length;
        int count=1;
        sb.append(chars[0]);
        for(int i=1; i<n;i++){
            char current= chars[i];
            char prev= chars[i-1];
            if(prev==current) 
                count++;
            if(prev!=current){
                if(count>1)
                    sb.append(count);
                sb.append(current);
                count=1;
            }
          }
        if(count>1) sb.append(count);
        for(int i=0; i<sb.length();i++){
            chars[i]= sb.charAt(i);
        }
        return sb.length();
        
        
    }
}