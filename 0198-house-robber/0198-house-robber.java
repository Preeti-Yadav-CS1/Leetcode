class Solution {
    public int rob(int[] nums) {
        //base condition
        if(nums.length<2)
            return nums[0];
        
        
        //maximum loot till
        int[] maxLootTill= new int[nums.length];
        
        //memoize maxLoot till frfist 2 house
        maxLootTill[0]= nums[0];
        maxLootTill[1]= Math.max(nums[0], nums[1]);
        
        //fill full maxLootTill array
        for(int i=2;i<nums.length;i++){
            maxLootTill[i]= Math.max(maxLootTill[i-2]+nums[i], maxLootTill[i-1]);
        }
        
        return maxLootTill[nums.length-1];
    }
}