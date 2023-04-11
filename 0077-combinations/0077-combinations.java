class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<Integer> combination= new ArrayList<>();
        List<List<Integer>> result= new ArrayList<>();
        
        combinations(1, n , k , combination, result);
        return result;
    }
    public void combinations(int num, int n, int k, List<Integer> combination, List<List<Integer>> result){
        if(num>n+1)
            return;
        
        if(combination.size()==k){
            result.add(new ArrayList<>(combination));
            return;
        }
        
        //take the number
        combination.add(num);
        combinations(num+1, n, k , combination, result);
        //dont take the number
        
        combination.remove(combination.size()-1);
        combinations(num+1, n, k, combination, result);
    }
}