class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result= new ArrayList<List<Integer>>();
        if(nums.length<3){
            return result;
        }
        
        //sort array
        Arrays.sort(nums);
        
        for(int i=0;i<nums.length-2;i++){
            //avoid duplicate solutions
            
            if(i==0 || nums[i]>nums[i-1]){
                int negative = -nums[i];
                int start= i+1;
                int end= nums.length-1;
                
                while(start< end){
                    //case 1:
                    if(nums[start]+nums[end]==negative){
                        ArrayList<Integer> temp= new ArrayList<Integer>();
                        
                        temp.add(nums[i]);
                        temp.add(nums[start]);
                        temp.add(nums[end]);
                        
                        result.add(temp);
                        start++;
                        end--;
                        
                        
                        // avoid duplicate solution
                        while(start<end && nums[end]==nums[end+1]){
                            end--;
                        }
                        while(start<end && nums[start]==nums[start-1]){
                            start++;
                        }
                    }else if(nums[start]+ nums[end]<negative){
                        start++;
                    }else{
                        end--;
                    }
                }
            }
        }
        return result;
    }
}