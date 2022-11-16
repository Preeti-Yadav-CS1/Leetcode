class Solution {
    public int myAtoi(String s) {
        
        //root condition
        if(s.length()<1 || s==null){
            return 0;
        }
        //trip all spaces
        s= s.replaceAll("^\\s+","");
        
        int count=0;
        
        //check if number is positive or negative
        
        boolean isNegative= s.startsWith("-");
        boolean isPositive= s.startsWith("+");
        
        if(isNegative ||isPositive)
            count++;
        
        //storage of converted number
        
        double number=0;
        
        while(count<s.length() && s.charAt(count)>='0' && s.charAt(count)<='9'){
            number= number*10+(s.charAt(count)-'0');
            count++;
        }
        number= isNegative? -number:number;
        return (int) number;
    }
}