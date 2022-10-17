class Solution {
    public void nextPermutation(int[] nums) {
        int p=0;
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                p=i; break;
            }
        }
        
        int q=0;
        for(int i=nums.length-1;i>p;i--){
             if(nums[i]>nums[p]){
                q=i; break;
            }
        }
        
        //already largest number
        if(p==0&& q==0){
            reverse(nums,0,nums.length-1);
            return;
        }
        
        int temp=nums[p];
        nums[p]= nums[q];
        nums[q]= temp;
        
        reverse(nums,p+1,nums.length-1);
    }
    
    public void reverse(int[] nums, int start, int end){
        while(start<end){
            int temp= nums[start];
            nums[start]=nums[end];
            nums[end]= temp;
            start++;
            end--;
        }
    }
}