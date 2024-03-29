class Solution {
    public String intToRoman(int num) {
        String roman[]={"I","IV","V","IX","X","XL","L","XC","C","CD","D","CM","M"};
        int[] value={1,4,5,9,10,40,50,90,100,400,500,900,1000};
        
        int i=roman.length-1;
        String answer="";
        while(num!=0){
            while(value[i]<=num){
                answer+=roman[i];
                num-=value[i];
            }
            i--;
        }
        return answer;
    }
}