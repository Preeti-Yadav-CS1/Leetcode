class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> subset= new ArrayList<>();
        List<List<Integer>> result= new ArrayList<>();
        subsets(nums, 0, subset, result);
        return result;
    }
    public void subsets(int[] nums, int index, List<Integer> subset, List<List<Integer>> result){
        if(index>=nums.length){
            result.add(new ArrayList<>(subset));
            return;
        }
        
        //option not add the number
        subsets(nums, index+1, subset, result);
        
        //add the number
        //choice by adding
        subset.add(nums[index]);
        subsets(nums, index+1, subset, result);
        //choice by not adding
        subset.remove(subset.size()-1);
    }
}