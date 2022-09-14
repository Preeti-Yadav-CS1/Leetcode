class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int product=1; int count=0; int faultyIndex=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<k) count++;
            else{
                faultyIndex=i+1;
                product=1;
                continue;
            }
            product*=nums[i];
            while(product>=k && faultyIndex<i){
                product/=nums[faultyIndex];
                faultyIndex++;
            }
            
            count+=(i-faultyIndex);
        }
        return count;
    }
}