package hackerBlockContest;
import java.util.*;
public class stringCompression {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        try{
            String str= scanner.next();
            compression(str);
        }finally{
            scanner.close();
        }
    }
    public static void compression(String str){
        int freq[]= new int[26];
        for(int i=0;i<str.length();i++){
            char ch= str.charAt(i);
            freq[ch-'a']++;
        }
        for(int i=0; i<26;i++){
            if(freq[i]!=0){
                int number= i+97;
                char character= (char)number;
                System.out.print(character+""+freq[i]);
            }

       }
    }
}
