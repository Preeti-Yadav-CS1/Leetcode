class Solution {
    public static class Pair implements Comparable<Pair>{
        int key;
        int freq;
        public Pair(int key,int freq){
            this.key= key;
            this.freq= freq;
        }
        
        public int compareTo(Pair p){
            return this.freq - p.freq;
        }
    }
    public static int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map= new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }
        
        PriorityQueue<Pair> pq= new PriorityQueue<>();
        for(int key: map.keySet()){
            Pair p= new Pair(key, map.get(key));
            pq.add(p);
        }
        
        int ans[]= new int[k];
        int idx=0;
        while(pq.size()!=0){
            if(pq.size()<=k){
                ans[idx]=pq.peek().key;
                idx++;
            }
            pq.remove();
        }
        return ans;
        
    }
}