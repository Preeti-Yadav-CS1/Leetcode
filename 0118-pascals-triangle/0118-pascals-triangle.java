class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> complete= new ArrayList<>();
        if(numRows==0) return complete;
        List<Integer> fristRow= new ArrayList<>();
        fristRow.add(1);
        complete.add(fristRow);
        for(int i=1;i<numRows;i++){
            List<Integer> prevRow=complete.get(i-1);
            List<Integer> currentRow= new ArrayList<>();
            currentRow.add(1);
            for(int j=1; j<i;j++){
                currentRow.add(prevRow.get(j-1)+ prevRow.get(j));
            }
            currentRow.add(1);
            complete.add(currentRow);
        }
        return complete;
    }
}