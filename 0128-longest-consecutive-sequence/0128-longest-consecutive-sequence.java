class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> numSet= new HashSet<Integer>();
        for(int num: nums)
            numSet.add(num);
        
        
        int maxSequence=0;
        for(int i=0;i<nums.length;i++){
            int currNum= nums[i];
            int currentSequenceLength= 1;
            
            if(!numSet.contains(currNum-1)){
                while(numSet.contains(currNum+1)){
                    currNum+=1;
                    currentSequenceLength+=1;
            }
            maxSequence= Math.max(maxSequence, currentSequenceLength);
            
            }
            
        }
        return maxSequence;
    }
}