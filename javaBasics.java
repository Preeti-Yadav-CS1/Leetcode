import java.util.Scanner;

//boilerplate code
public class javaBasics{
    /**
     * @param args
     */
    // public static boolean isPrime(int num){
    //     if(num==0 || num==1 || num==2){
    //         return true;
    //     }
    //     for(int i=2; i<=Math.sqrt(num);i++){
    //         if(num%i==0){
    //             return false;
    //         }
    //     }
    //     return true;
    // }
    // public static void BinToDec(int num){
    //     int pow=0;
    //     int decNum=0;
    //     while(num>0){
    //         int lastDigit=num%10;
    //         decNum= decNum+(lastDigit*(int)Math.pow(2, pow));

    //         pow++;
    //         num/=10;
    //     }
    //     System.out.println(decNum);
    // }
    // public static void DecToBin(int decNum){
    //     int number= decNum;
    //     int pow=0;
    //     int binNum=0;
    //     while(decNum>0){
    //         int rem= decNum%2;
    //         binNum+=rem*(int)Math.pow(10, pow);
    //         pow++;
    //         decNum/=2;
    //     }
    //     System.out.println("Binary format of number "+number +" is "+binNum);
    // }
    /**
     * @param args
     */
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        try{
            int num=sc.nextInt();
            for(int i=0; i<num;i++){
                char ch='A';
                for(int j=0; j<=i;j++){
                    System.out.print(ch);
                    ch++;
                }
                // ch++;
                System.out.println();
            }
        }
        finally{
            sc.close();
        }
        // char ch='A';
        // int num=sc.nextInt();
        // for(int i=0; i<num;i++){
        //     char ch='A';
        //     for(int j=0; j<=i;j++){
        //         System.out.print(ch);
        //         ch++;
        //     }
        //     // ch++;
        //     System.out.println();
        // }
    }
}