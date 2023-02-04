class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
        HashSet<Integer> set= new HashSet<>();
        for(int i: banned){
            set.add(i);
        }
        int maxCount=0;
        int sum=0;
        for(int i=1;i<=n;i++){
            if(!set.contains(i)){
                if(maxSum>=(sum+i)){
                    maxCount++;
                    sum+=i;
                }
            }
        }
        
        return maxCount;
    }
}