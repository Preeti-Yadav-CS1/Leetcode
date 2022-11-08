package hackerBlockContest;
import java.util.*;
public class ReadThis {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        try{
            String str= scanner.next();

            // main logic
            int idx=0;
            for(int i=0;i<str.length();i++){
                if(str.charAt(i)>=65 && str. charAt(i)<=90){
                    String output="";
                    output= str. substring(idx,i);
                    idx=i;
                    System.out.println(output);
                }
            }
            String output="";
            output= str.substring(idx, str.length());
            System.out.println(output);
        }finally{
            scanner.close();
        }
        
    }
} 
