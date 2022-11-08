class Solution {
    public int maxArea(int[] height) {
        int start=0, end=height.length-1;
        int maxTrappedWater=0, blockTrappedWater=0;
        while(start<end){
            if(height[start]<height[end]){
                blockTrappedWater= height[start]*(end-start);
                start++;
            }else{
                blockTrappedWater= height[end]*(end-start);
                end--;
            }
            if(blockTrappedWater>maxTrappedWater) maxTrappedWater= blockTrappedWater;
        }
        return maxTrappedWater;
        
    }
}