class Solution {
    public int triangleNumber(int[] nums) {
        int n= nums.length;
        Arrays.sort(nums);
        int ans=0;
        for(int i= n-1;i>=1;i--){
            int k= 0,j= i-1;
            while(k<j){
                if(nums[i]< nums[k]+nums[j]){
                    ans+=(j-k);
                    j--;
                }else
                    k++;
            }
        }
        
        return ans;
    }
}