class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> result= new ArrayList<>();
        for(int i=left;i<=right;i++){
            if(isdivide(i))
                result.add(i);
        }
        return result;
    }
    public boolean isdivide(int n){
        int temp= n;
        while(temp>0){
            int lastDigit= temp%10;
            temp/=10;
            if(lastDigit==0 || (n%lastDigit)!=0){
                return false;
            }
        }
        return true;
    }
}