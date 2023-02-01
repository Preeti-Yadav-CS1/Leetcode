class Solution {
    public int maximumTastiness(int[] price, int k) {
        Arrays.sort(price);
        int low=0; int high= price[price.length-1]-price[0];
        int result= 0, mid, sum;
        while(low<=high){
            mid=low+(high-low)/2;
            if(check(price, k, mid)){
                low=mid+1;
                result=mid;
            }else{
                high= mid-1;
            }
        }
        return result;
    }
    public boolean check(int[] price, int k, int mid){
        int prev= price[0];
        int count=1;
        for(int i=0;i<price.length;i++){
            if(count<k){
                if(price[i]-prev>=mid){
                    count++;
                    prev= price[i];
                }
            }
        }
        return count==k;
    }
}