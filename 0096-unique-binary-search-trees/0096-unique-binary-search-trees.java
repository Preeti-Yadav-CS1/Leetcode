class Solution {
    public int numTrees(int n) {
        HashMap<Integer, Integer> map= new HashMap<>();
        map.put(0,1);
        map.put(1,1);
        return function(n, map);
    }
    public int function(int n, HashMap<Integer,Integer> map){
        if(map.containsKey(n)){
            return map.get(n);
        }
        int sum=0;
        for(int i=1;i<=n;i++){
            sum+= function(i-1, map)* function(n-i, map);
        }
        map.put(n ,sum);
        return sum;
    }
}