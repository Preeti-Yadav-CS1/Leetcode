// O(n3)- time complexity

class Solution {
    public int maxSubArray(int[] nums) {
        int currSum=0;
        int maxSum= Integer.MIN_VALUE;
        for(int i=0; i<nums.length;i++){
            int start=i;
            for(int j=i;j<nums.length;j++){
                int end=j;
                currSum=0;
                for(int k=start; k<=end;k++){
                    currSum+=nums[k];
                }
                if(currSum>maxSum){
                    maxSum= currSum;
                }
            }
        }
        return maxSum;
    }
}
