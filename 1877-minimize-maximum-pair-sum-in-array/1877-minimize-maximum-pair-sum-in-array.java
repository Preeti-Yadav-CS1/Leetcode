class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int start=0;
        int end= nums.length-1;
        int maximum=Integer.MIN_VALUE;
        int pairSum;
        while(start<end){
            pairSum= nums[start]+nums[end];
            maximum=Math.max(pairSum, maximum);
            start++;
            end--;
        }
        return maximum;
    }
}