class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int j=0, result= Integer.MAX_VALUE;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            while(sum>=target){
                result= Math.min(result, i-j+1);
                sum-=nums[j];
                j++;
            }
        }
        return (result !=Integer.MAX_VALUE)? result: 0;
    }
}