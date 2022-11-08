package hackerBlockContest;
import java.util.*;
public class kartikBhaiya {
    public static void main(String args[]) {
		Scanner scanner=new Scanner(System.in);
		int change= scanner.nextInt();
		String test= scanner.next();
		int flipa= function(test, 'a',change);
		int flipb= function(test,'b',change);
		System.out.println(Math.max(flipa, flipb));

    }
	public static int function(String test,char ch,int change){
		int end=0;
		int start=0;
		int flip=0;
		int count=0;
		while(end<test.length()){
			//grow window
			if(test.charAt(end)==ch){
				flip++;
			}
			//shrink window until fit
			while(flip>change){
				if(test.charAt(start)==ch)
					flip--;
				start++;
			}
			//calculate answer
			count= Math.max(count,end-start+1);
			end++;
		}
		return count;
	}
}
