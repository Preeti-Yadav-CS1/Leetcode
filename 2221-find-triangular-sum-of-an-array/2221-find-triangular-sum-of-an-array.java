class Solution {
    public int triangularSum(int[] nums) {
        return find(nums, nums.length);
    }
    public int find(int[] nums, int n){
        if(n==1){
            return nums[0];
        }
        
        for(int i=0;i<n-1;i++){
            nums[i]= (nums[i]+nums[i+1])%10;
        }
        return find(nums, n-1);
    }
}