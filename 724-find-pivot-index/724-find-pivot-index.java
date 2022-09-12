class Solution {
    public int pivotIndex(int[] nums) {
        int n= nums.length;
        int prefixLeft[]= new int[n];
        prefixLeft[0]=nums[0];
        for(int i=1;i<n;i++){
            prefixLeft[i]=prefixLeft[i-1]+nums[i];
        }
        
        int prefixRight[]= new int[n];
        prefixRight[n-1]=nums[n-1];
        for(int i=n-2;i>=0;i--){
            prefixRight[i]=prefixRight[i+1]+nums[i];
        }
        
        for(int i=0;i<n;i++){
            if(prefixLeft[i]==prefixRight[i]) return i;
        }
        return -1;
    }
}