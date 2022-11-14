class Solution {
    
    public void rotate(int[] nums, int k) {
        // approach 1: reversal O(1)- space complexity O(n)- time complexity
        
        k= k%nums.length;
        //length of frist part
        int len= nums.length-k;
        reverse(nums,0,len-1);
        reverse(nums, len, nums.length-1);
        reverse(nums, 0, nums.length-1);
        
        //approach 2:Intermediate Array Approach
        // int arr[]= new int[nums.length];
        // for(int i=0;i<k;i++){
        //     arr[i]= nums[nums.length-k+i];
        // }
        // int j=0;
        // for(int i=k;i<nums.length;i++){
        //     arr[i]= nums[j];
        //     j++;
        // }
        // System.arraycopy(arr,0,nums,0, nums.length);
        
        //
        //approach 3: Bubble Rotate
//         for(int i=0;i<k;i++){
//             for(int j=nums.length-1;j>0;j--){
//                 int temp= nums[j];
//                 nums[j]= nums[j-1];
//                 nums[j-1]= temp;
                
//             }
//         }
        
    }
    public void reverse(int[] nums, int start, int end){
        while(start<end){
            int temp= nums[start];
            nums[start]= nums[end];
            nums[end]= temp;
            start++;
            end--;
        }
    }
    
}