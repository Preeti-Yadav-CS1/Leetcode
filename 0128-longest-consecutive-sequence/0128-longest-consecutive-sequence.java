class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0;
        int currMaxSeq=1;
        int maxSequence=1;
        Arrays.sort(nums);
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]==nums[i])
                continue;
            if(nums[i-1]+1==nums[i]){
                currMaxSeq++;
                maxSequence=Math.max(currMaxSeq, maxSequence);
            }else
                currMaxSeq=1;
        }
        
        
        return maxSequence;
    }
}