package hackerBlockContest;
import java.util.*;
public class goodString {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        try{
            String str= scanner.next();
            int count=GoodString(str);
            System.out.println(count);
        }finally{
            scanner.close();
        }
    }
    public static int GoodString(String str){
        int l=0;
        int ans=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i'|| str.charAt(i)=='o' || str.charAt(i)=='u'){
                l+=1;
            }else{
                l=0;
            }
            ans= Math.max(ans, l);
        }
        return ans;
    }
}
