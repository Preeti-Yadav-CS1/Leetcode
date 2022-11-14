class Solution {
    
    public void rotate(int[] nums, int k) {
        // approach 1: reversal O(1)- space complexity O(n)- time complexity
        k= k%nums.length;
        //length of frist part
        int len= nums.length-k;
        reverse(nums,0,len-1);
        reverse(nums, len, nums.length-1);
        reverse(nums, 0, nums.length-1);
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