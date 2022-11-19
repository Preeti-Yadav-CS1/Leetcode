class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int num=0;
        for(String s: operations){
            if(s.compareTo("++X")==0 || s.compareTo("X++")==0 ){
                num+=1;
            }else 
                num-=1;
            
        }
        return num;
    }
}