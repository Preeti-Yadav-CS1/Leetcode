class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n= nums1.length+nums2.length;
        int[] result= new int[n];
        int i=0, j=0, index=0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]<nums2[j]){
                result[index++]=nums1[i++];
            }else{
                result[index++]=nums2[j++];
            }
        }
        while(i<nums1.length)
            result[index++]= nums1[i++];
        while(j<nums2.length)
            result[index++]= nums2[j++];
        int mid= n/2;
        double ans;
        if(n%2==0){
            return (float) (result[mid]+result[mid-1])/2;
        }
        return result[mid];
    }
}