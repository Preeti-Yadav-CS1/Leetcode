class Solution {
    public int rob(int[] nums) {
        //base condition
        if(nums.length<2)
            return nums[0];
        
        //create array by skiping first house
        int[] skipFristHouse = new int[nums.length-1];
        
        //create array by skippint last house
        int[] skipLastHouse = new int[nums.length-1];
        
        for(int i=0;i<nums.length-1;i++){
            skipFristHouse[i]= nums[i+1];
            skipLastHouse[i]= nums[i];
        }
        
        
        // get maximum loot possible by both sides
        int LootSkipFrist= robHelp(skipFristHouse);
        int LootSkipLast = robHelp(skipLastHouse);
        
        return Math.max(LootSkipFrist, LootSkipLast);
    }
    public int robHelp(int[] nums) {
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