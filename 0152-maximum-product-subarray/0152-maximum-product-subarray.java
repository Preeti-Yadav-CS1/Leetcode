class Solution {
    public int maxProduct(int[] nums) {
//         int mx= Integer.MIN_VALUE;
        
//         for(int i=0;i<nums.length;i++){
//             for(int j=0;j<nums.length;j++){
//                 if(i+j <nums.length){
//                     int product= calproduct(nums,i,j);
//                     mx=Math.max(product,mx);
//                 }
//             }
//         }
//         return mx;
        
        
        if(nums==null|| nums.length==0){
            return 0;
        }
        
        int global=nums[0];
        int minlocal= nums[0];
        int maxlocal= nums[0];
        
        for(int i=1;i<nums.length;i++){
            int temp= maxlocal;
            maxlocal=Math.max(Math.max(nums[i]*maxlocal,nums[i]), nums[i]*minlocal);
            minlocal=Math.min(Math.min(nums[i]*temp,nums[i]), nums[i]*minlocal);
            global= Math.max(global, maxlocal);
        }
        return global;
    }
    
    // public int calproduct(int[]nums, int i, int j){
    //     int result=1;
    //     for(int k=i;k<=j;k++){
    //         result*=nums[k];
    //     }
    //     return result;
    // }
}