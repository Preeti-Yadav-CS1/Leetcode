class Solution {
    public int maximumGroups(int[] grades) {
        int group=1;
        int n= grades.length;
        while((group*(group+1))/2 <=n){
            group++;
        }
        return --group;
        
    }
}