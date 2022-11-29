class Solution {
    public int maximum69Number (int num) {
        int place = 1;
        int maxPlace = Integer.MIN_VALUE;
        int copy = num;
        while(num>0){
            int digit = num % 10;
            if(digit == 6)
                maxPlace = place;
            place*=10;
            num/=10;
            
        }
        
        return maxPlace == Integer.MIN_VALUE ? copy : copy+(3*maxPlace);
    }
}