class Solution {
    public List<Integer> lexicalOrder(int n) {
        ArrayList<Integer> res= new ArrayList<Integer>();
        Lexico(n,0,res);
        return res;
    }
    public static void Lexico(int n, int curr,ArrayList<Integer> res){
       for(int i=0;i<=9;i++){
           if((curr*10+i)>0 && (curr*10+i) <=n){
                res.add(curr*10+i);
                Lexico(n,curr*10+i,res);
           }
       }
    }
}