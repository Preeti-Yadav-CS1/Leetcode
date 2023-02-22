class Solution {
    public int splitArray(int[] nums, int k) {
        int low= Integer.MIN_VALUE;
        int high=0;
        for(int i=0;i<nums.length;i++){
            low= Math.max(nums[i], low);
            high+=nums[i];
        }
        
        int ans=0;
        while(low<=high){
            int mid= low+(high-low)/2;
            if(isPossible(nums, mid,k)){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
    }
    public boolean isPossible(int nums[], int mid, int k){
        int check=1;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(sum>mid){
                check++;
                sum= nums[i];
            }
        }
        return check<=k;
    }
}