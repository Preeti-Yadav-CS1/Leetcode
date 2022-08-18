import java.util.*;
//boilerplate code
public class patterns{
    // public static void hollowPattern(){
    //     int row=4;
    //     int column=4;
    //     for(int i=0;i<row;i++){
    //         for(int j=0;j<column;j++){
    //             if(i==0||i==row-1|| j==0||j==column-1){
    //                 System.out.print("*");
    //             }
    //             else{
    //                 System.out.print(" ");
    //             }
    //         }
    //         System.out.println();
    //     }
    // }
    // public static void AlphaPettern(){
    //     Scanner sc = new Scanner(System.in);
    //     try{
    //         int num=sc.nextInt();
    //         for(int i=0; i<num;i++){
    //             char ch='A';
    //             for(int j=0; j<=i;j++){
    //                 System.out.print(ch);
    //                 ch++;
    //             }
    //             // ch++;
    //             System.out.println();
    //         }
    //     }
    //     finally{
    //         sc.close();
    //     }
    // }
    // public static void inverted_rotated_half_pyramid(int row){
    //     // int row=4;
    //     // int column=4;
    //     for(int i=0; i<row;i++){
    //         for(int j=0; j<row-i;j++){
    //             System.out.print(" ");
    //         }
    //         for(int j=0;j<=i;j++){
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }
    // }
    // public static void inverted_pyramid_with_numbers(int num){
    //     for(int i=1; i<=num;i++){
    //         for(int j=1; j<=num-i+1; j++){
    //             System.out.print(j);
    //         }
    //         System.out.println();
    //     }
    // }
    // public static void floydsTraingle(int num){
    //     int number=1;
    //     for(int i=0; i<num;i++){
    //         for(int j=0; j<=i;j++){
    //             System.out.print(number++ +" ");
    //         }
    //         System.out.println();
    //     }
    // }
    // public static void zeroOnePattern(int num){
    //     for(int i=0; i<num;i++){
    //         for(int j=0; j<=i;j++){
    //             if((i+j)%2==0){
    //                 System.out.print("1 ");
    //             }else{
    //                 System.out.print("0 ");
    //             }
    //         }
    //         System.out.println();
    //     }
    // }
    // public static void butterrflyPattern(int num){
    //     for(int i=1; i<=num;i++){
    //         for(int j=1; j<=i;j++){
    //             System.out.print("*");
    //         }
    //         for(int j=1;j<=2*(num-i);j++){
    //             System.out.print(" ");
    //         }
    //         for(int j=1;j<=i;j++){
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }
    //     for(int i=num; i>=1;i--){
    //         for(int j=1; j<=i;j++){
    //             System.out.print("*");
    //         }
    //         for(int j=1;j<=2*(num-i);j++){
    //             System.out.print(" ");
    //         }
    //         for(int j=1;j<=i;j++){
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }
    // }
    // public static void solidRhombus(int num){
    //     for(int i=0; i<num;i++){
    //         for(int j=0; j<num-i;j++){
    //             System.out.print(" ");
    //         }
    //         for(int j=0;j<num;j++){
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }
    // }
    // public static void hollowRhombus(int num){
    //     for(int i=0; i<num;i++){
    //         for(int j=0; j<num-i;j++){
    //             System.out.print(" ");
    //         }
    //         for(int j=0;j<num;j++){
    //             if(i==0||i==num-1||j==0||j==num-1){
    //                 System.out.print("*");
    //             }else{
    //                 System.out.print(" ");
    //             }
    //         }
    //         System.out.println();
    //     }
    // }
    public static void daimondPattern(int num){
        for(int i=0; i<num;i++){
            for(int j=num-i; j>0;j--){
                System.out.print(" ");
            }
            for(int j=0;j<(2*i-1);j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=num; i>0;i--){
            for(int j=num-i; j>0;j--){
                System.out.print(" ");
            }
            for(int j=0;j<(2*i-1);j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    public static void main(String args[]){
        // hollowPattern();
        // AlphaPettern();
        // inverted_rotated_half_pyramid(4);
        // inverted_pyramid_with_numbers(5);
        // floydsTraingle(5);
        // zeroOnePattern(5);
        // butterrflyPattern(4);
        // solidRhombus(5);
        // hollowRhombus(5);
        daimondPattern(5);
        }
        
    }
