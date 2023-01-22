class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        //all elements are distinct
        // all integers appered in nums2
        int[] nextGre= nextGreater(nums2);
        
        HashMap<Integer, Integer> hp= new HashMap<>();
        for(int i=0;i<nums2.length;i++){
            hp.put(nums2[i], nextGre[i]);
        }
        
        
        int result[]= new int[nums1.length];
        for(int i =0;i<nums1.length;i++){
            result[i]= hp.get(nums1[i]);
        }
        
        return result;
    }
    public int[] nextGreater(int[] nums){
        int [] nextGre= new int[nums.length];
        nextGre[nums.length-1]=-1;
        
        Stack<Integer> st= new Stack<>();
        st.push(nums[nums.length-1]);
        
        for(int i= nums.length-2; i>=0; i--){
            while(st.size()>0 && st.peek() < nums[i]){
                st.pop();
            }
            if(st.size() > 0){
                nextGre[i]= st.peek();
            }else{
                nextGre[i]=-1;
            }
            st.push(nums[i]);
        }
        return nextGre;
    }
}