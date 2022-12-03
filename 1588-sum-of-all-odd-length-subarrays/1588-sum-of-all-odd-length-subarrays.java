class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int sum=0;
        for(int i=1;i<arr.length+1;i+=2){
            for(int j=0;j<i;j++){
                for(int k=j;k<=arr.length-i+j;k++){
                    sum+=arr[k];
                }
            }
        }
        return sum;
    }
}