class Solution {
    public int distributeCandies(int[] candyType) {
        HashSet<Integer> set= new HashSet<>();
        for(int i=0;i<candyType.length;i++){
            set.add(candyType[i]);
        }
        
        int num= candyType.length/2;
        if(num<=set.size())
            return num;
        
        return set.size();
    }
}