class Solution {
    public boolean canArrange(int[] arr, int k) {
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int val:arr){
            int rem= val%k;
            if(rem<0)
                rem+=k;
            map.put(rem, map.getOrDefault(rem,0)+1);
        }
        
        for(int val:map.keySet()){
            int rem= val%k;
            
            if(rem==0 || (2*rem)==k){
                int freq=map.get(rem);
                if(freq%2!=0)
                    return false;
            }else{
                int freq=map.get(rem);
                int remaningFreq=map.getOrDefault(k-rem,0);
                if(freq!=remaningFreq)
                    return false;
            }
        }
        
        return true;
    }
}