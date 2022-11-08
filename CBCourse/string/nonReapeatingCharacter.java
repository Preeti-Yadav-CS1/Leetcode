package hackerBlockContest;

import java.util.*;
public class nonReapeatingCharacter {
    public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
        try{
            int test= scanner.nextInt();

            for(int i = 0; i < test;i++){
                String str= scanner.next();
                int ch = nonRepeating(str);
                
                if(ch!= -1){
                    System.out.println(str.charAt(ch));
                }else{
                    System.out.println(-1);
                }
            }
        }finally{
            scanner.close();
        }
		
    }
	public static int nonRepeating(String str){
		// approach 1:
		for(int i=0; i<str.length();i++){

			boolean unique= true;
			for(int j=0; j<str.length();j++){
				if(i!=j && str.charAt(i)== str.charAt(j)){
					unique= false;
					break;
				}
			}
			if(unique){
				return i;
			}

		}

		return -1;
	}
}
