class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int product=1;
        int count=0; 
        int start=0;
        int end=0;
        while(end<nums.length){
            //window grow
            product*=nums[end];
            
            //window shink until range
            while(product>=k && start<=end){
                product/=nums[start];
                start++;
            }
            
            //count calcualte
            count+=(end-start+1);
            end++;
        }
        return count;
    }
}