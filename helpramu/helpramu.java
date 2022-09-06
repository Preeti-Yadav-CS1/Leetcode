import java.util.*;
public class Main {
    public static void main(String args[]) {
		Scanner scanner= new Scanner(System.in);
		int test= scanner.nextInt();
		int c1,c2,c3,c4,n,m;
		while(test!=0){
			c1= scanner.nextInt();
			c2= scanner.nextInt();
			c3= scanner.nextInt();
			c4= scanner.nextInt();
			n= scanner.nextInt();
			m= scanner.nextInt();

			int rick[]=new int[1000];
			int cab[]= new int[1000];

			for(int i=0;i<n;i++){
				rick[i]= scanner.nextInt();
			}

			for(int i=0;i<m;i++){
				cab[i]= scanner.nextInt();
			}

			int rickCost=0;
			for(int i=0;i<n;i++){
				rickCost+=Math.min((c1*rick[i]),c2);
			}
			rickCost=Math.min(rickCost,c3);

			int cabCost=0;
			for(int i=0;i<m;i++){
				cabCost+=Math.min((c1*cab[i]),c2);
			}
			cabCost=Math.min(cabCost,c3);


			int result=Math.min(c4,cabCost+rickCost);
			System.out.println(result);
			test--;
		}
    }
}
