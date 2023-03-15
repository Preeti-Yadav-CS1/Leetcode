class Solution {
    public int minPatches(int[] nums, int n) {
        int i= 0;
        int count=0;
        long missing=1;
        while(missing<=n){
            if(i<nums.length && missing>=nums[i]){
                missing+=nums[i];
                i++;
            }else{
                count++;
                missing+=missing;
            }
        }
        return count;
    }
}