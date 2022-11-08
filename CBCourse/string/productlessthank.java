package hackerBlockContest;

import java.util.Scanner;

public class productlessthank {
    //driver code
    public static void main(String args[])
    {
        Scanner scanner= new Scanner(System.in);
        try{
            int n= scanner.nextInt();

            int k = scanner.nextInt();
            int[] array= new int[n];
            for(int i=0;i<n;i++){
                array[i]= scanner.nextInt();
            }
            int size = array.length;
    
            int count = countsubarray(array, size, k);
            System.out.print(count);

        }finally{
            scanner.close();
        }
    }
    public static int countsubarray(int array[], int n, int k)
    {
        int count = 0;
        int i, j, mul;
 
        for (i = 0; i < n; i++) {
 
            // Counter for single element
            if (array[i] < k)
                count++;
 
            mul = array[i];
 
            for (j = i + 1; j < n; j++) {
 
                // Multiple subarray
                mul = mul * array[j];
 
                // If this multiple is less
                // than k, then increment
                if (mul < k)
                    count++;
                else
                    break;
            }
        }
 
        return count;
    }
}

 
