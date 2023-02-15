class Solution {
    public List<Integer> addToArrayForm(int[] nums, int k) {
        int n=nums.length;
        int i=n;
        int curr= k;
        List<Integer> result= new ArrayList<>();
        while(--i>=0 || curr>0){
            if(i>=0){
                curr+=nums[i];
            }
            result.add(curr%10);
            curr/=10;
        }
        Collections.reverse(result);
        return result;
    }
}