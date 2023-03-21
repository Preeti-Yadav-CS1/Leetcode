class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long ans=0;
        long subArray=0;
        for(int num:nums){
            if(num==0)
                subArray++;
            else
                subArray=0;
            ans+=subArray;
        }
        
        return ans;
    }
}