class Solution {
    public int findPeakElement(int[] nums) {
        return findPeak(nums,0,nums.length-1, nums.length-1);
        
    }
    public int findPeak(int nums[], int start, int end, int n){
        int mid= start+(end-start)/2;
        
        for(int i=0;i<n;i++){
            if((mid==0 ||nums[mid]>nums[mid-1]) && (mid==n ||nums[mid]>nums[mid+1])){
                return mid;
            }else if(mid>0 && nums[mid]<nums[mid-1]){
                return findPeak(nums, start, mid-1,n);
            }else{
                return findPeak(nums, mid+1, end, n);
            }
        }
        
        return 0;
    }
}