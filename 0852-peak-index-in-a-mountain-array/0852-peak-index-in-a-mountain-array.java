class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        return findPeak(arr,0,arr.length-1, arr.length-1);
    }
    public int findPeak(int []arr, int start, int end, int n){
        int mid= start+(end-start)/2;
        for(int  i=0;i<n;i++){
            if((mid==0|| arr[mid] > arr[mid-1]) && (mid==n-1 || arr[mid] > arr[mid+1])){
                return mid;
            }else if(mid>0 && arr[mid]<arr[mid-1]){
                return findPeak(arr, start, mid-1, n);
            }else{
                return findPeak(arr, mid+1, end,n);
            }
        }
        return 0;
    }
}