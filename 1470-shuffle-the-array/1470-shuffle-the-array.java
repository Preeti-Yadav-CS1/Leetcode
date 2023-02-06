import java.util.*;
class Solution {
    public int[] shuffle(int[] nums, int n) {
        int index=0;
        int arr[]= new int[nums.length];
        for(int i=0;i<nums.length;i++){
            arr[i]= nums[index];
            arr[i+1]= nums[n];
            n++;i++; index++;
        }
        return arr;
    }
}