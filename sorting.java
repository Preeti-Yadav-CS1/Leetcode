import java.util.*;
public class sorting{
    /**
     * @param args
     */
    public static void main(String[] args) {
        int arr[]= new int[8];
        arr[0]=1;
        arr[1]=4;
        arr[2]=1;
        arr[3]=3;
        arr[4]=2;
        arr[5]=4;
        arr[6]=3;
        arr[7]=7;
        int largest= Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            largest= Math.max(largest,arr[i]);
            
        }
        System.out.print(largest+" ");
    }
}