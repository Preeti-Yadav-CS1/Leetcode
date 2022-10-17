class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0, result=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!= 1)
                count=0;
            else
                result= Math.max(++count, result);
        }
        return result;
    }
}