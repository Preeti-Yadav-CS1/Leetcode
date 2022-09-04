class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int nonWrapSum=maxSubArray(nums);
        int totalSum=0;
        for(int i=0;i<nums.length;i++){
            totalSum+=nums[i];
            // nums[i]=-nums[i];
        }
        int nonContributingSum= maxSubArray(nums);
        int minSum= minSubArray(nums);
        if(totalSum==minSum) return nonContributingSum;
        int wrapSum= totalSum- minSum;
        return Math.max(nonWrapSum, wrapSum);
    }
    public int maxSubArray(int[] nums) {
        int currSum=nums[0];
        int maxSum= nums[0];
        for(int i=1; i<nums.length; i++){
            currSum= Math.max(nums[i], nums[i]+currSum);
            maxSum= Math.max(currSum, maxSum);
        }
        return maxSum;
    }
    public int minSubArray(int[] nums) {
        int currSum=nums[0];
        int minSum= nums[0];
        for(int i=1; i<nums.length; i++){
            currSum= Math.min(nums[i], nums[i]+currSum);
            minSum= Math.min(currSum, minSum);
        }
        return minSum;
    }
}