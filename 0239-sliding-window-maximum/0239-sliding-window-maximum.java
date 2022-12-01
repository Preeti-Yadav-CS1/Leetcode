class Solution {
    public int[] maxSlidingWindow(int[] arr, int k) {
        int n= arr.length;
        int[] ans= new int[n-k+1];
        Deque<Integer> dq= new LinkedList<Integer>();
        for(int i=0;i<k;i++){
            while(!dq.isEmpty()&& arr[i]>arr[dq.getLast()]){
                dq.removeLast();

            }
            dq.add(i);
        }
        
        ans[0]=arr[dq.getFirst()];
        int index=1;
        for(int i= k;i<arr.length;i++){
            while(!dq.isEmpty()&& arr[i]>arr[dq.getLast()]){
                dq.removeLast();

            }
            dq.add(i);
            if(!dq.isEmpty()&& dq.getFirst()==i-k){
                dq.removeFirst();
            }
            ans[index]=arr[dq.getFirst()];
            index++;
        }

        return ans;
    }
}