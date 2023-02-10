class Solution {
    public int differenceOfSum(int[] nums) {
        int sum=0;
        int digitSum=0;
        for(int i=0;i<nums.length;i++){
            int n= nums[i];
            sum+=n;
            while(n>0){
                int lastDigit= n%10;
                digitSum+=lastDigit;
                n/=10;
            }
        }
        
        return sum>digitSum? sum-digitSum: digitSum-sum;
    }
}