class Solution {
    public int differenceOfSum(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        int digitSum=0;
        for(int i=0;i<nums.length;i++){
            int n= nums[i];
            while(n>0){
                int lastDigit= n%10;
                digitSum+=lastDigit;
                n/=10;
            }
        }
        
        return sum>digitSum? sum-digitSum: digitSum-sum;
    }
}