package hackerBlockContest.SlidingWindow;

public class TargetSumPairs {
    public static void main(String args[]) {
        Scanner scanner= new Scanner(System.in);
		int n= scanner.nextInt();
		int arr[]= new int[n];
		for(int i=0;i<n;i++){
			arr[i]= scanner.nextInt();

		}
		int target= scanner.nextInt();
        sum(arr, 0, n-1, target);
    }
    public static void sum(int[] arr, int start, int end, int target){
        Arrays.sort(arr);
        while(start<end){
            int sum1=arr[start]+arr[end];
            if(sum1== target){
                System.out.println(arr[start]+" and "+ arr[end]);
                start++;
                end--;
                continue;
            }else if(sum1> target) end--;
            else start++;
        }
        return;
    }
}
