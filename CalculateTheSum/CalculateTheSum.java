import java.util.*;
public class Main {
    public static void main(String args[]) {
		Scanner scanner= new Scanner(System.in);
		int n=scanner.nextInt();

		//input array
		int sumArray[]= new int[n];
		for(int i=0;i<n;i++){
			sumArray[i]= scanner.nextInt();
		}
		//copy in temp
		int temp[]= new int[n];
		for(int i=0;i<n;i++){
			temp[i]=sumArray[i];
		}

		int Q= scanner.nextInt();
		while(Q-->0){
			int x= scanner.nextInt();

			x=x%sumArray.length;
			//kaam
			for(int i=0;i<n;i++){
				int r= i-x;
				if(r<0) r=n+r;
				sumArray[i]+=temp[r];

			}

			//update temp
			for(int i=0;i<n;i++){
			temp[i]=sumArray[i];
			}
		}
		int result=0;
		for(int i=0;i<n;i++){
			result+=sumArray[i];
		}

		//result result%10^9+7;
		System.out.println(result%((int)Math.pow(10,9)+7));
		
    }
}
