package hackerBlockContest;

import java.util.*;
public class isPalindrome {
    public static void main(String args[]) {
        // Your Code Here
		Scanner scanner= new Scanner(System.in);
        try{
		String str= scanner.next();
		if(ispalindrome(str)){
			System.out.println("true");
		}else{
			System.out.println("false");

		}
        }finally{
            scanner.close();
        }
    }
	public static boolean ispalindrome(String str){
		int left=0;
		int right= str.length()-1;
		// boolean check;
		while(left<=right){
			if(str.charAt(left)==str.charAt(right)){
				left+=1;
				right-=1;
			}else{
				return false;
			}
		}
		return true;
	}
}
