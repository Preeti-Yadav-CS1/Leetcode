class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> result= new ArrayList<>();
        for(int i=left;i<=right;i++){
            boolean flag= true;
            int temp=i;
            while(temp>0){
                int lastDigit= temp%10;
                temp/=10;
                if(lastDigit==0 || i%lastDigit!=0){
                    flag= false;
                    break;
                }
            }
            if(flag==true){
                result.add(i);
            }
        }
        return result;
    }
}