class Solution {
    public int thirdMax(int[] nums) {
        Integer max= null;
        Integer second= null;
        Integer third= null;
        
        for(Integer num: nums){
            if(num.equals(max)||num.equals(second)|| num.equals(third) ){
                continue;
            }
            
            if(max==null || num>max){
                third= second;
                second= max;
                max=num;
            }else if(second==null || second<num){
                third= second;
                second=num;
            }else if(third==null || num> third){
                third= num;
            }
            
        }
        
        if(third==null) return max;
        
        return third;
    }
}