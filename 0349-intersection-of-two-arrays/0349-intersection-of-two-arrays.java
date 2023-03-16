class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set= new HashSet<>();
        for(int i: nums1){
            set.add(i);
        }
        int count=0;
        for(int i: nums2){
            if(set.contains(i)){
                count++;
                set.remove(i);
            }
        }
        
        int result[]= new int[count];
        
        for(int i: nums1){
            set.add(i);
        }
        int j=0;
        for(int i: nums2){
            if(set.contains(i)){
                result[j++]= i;
                set.remove(i);
            }
        }
        return result;
    }
}