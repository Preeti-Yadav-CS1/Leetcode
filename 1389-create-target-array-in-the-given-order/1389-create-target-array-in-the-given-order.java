class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> result= new ArrayList<Integer>();
        int n= nums.length;
        int res[]= new int[n];
        
        for(int i=0;i<nums.length;i++){
            result.add(index[i],nums[i]);
        }
        for(int i=0;i<nums.length;i++){
            res[i]= result.get(i);
        }
        return res;
    }
}