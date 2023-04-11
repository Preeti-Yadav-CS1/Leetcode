class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> combination= new ArrayList<>();
        List<List<Integer>> result= new ArrayList<>();
        combinations(candidates, 0, target, combination, result);
        return result;
    }
    
    public void combinations(int[] candidate, int start, int target, List<Integer> combination, List<List<Integer>> result){
        if(target==0){
            result.add(new ArrayList<>(combination));
            return;
        }
        
        
        for(int i=start; i<candidate.length;i++){
            if(candidate[i]>target){
                continue;
            }
            
            combination.add(candidate[i]);
            combinations(candidate, i, target-candidate[i], combination, result);
            combination.remove(combination.size()-1);
        }
    }
}