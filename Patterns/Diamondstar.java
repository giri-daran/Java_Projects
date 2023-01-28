package Patterns;

import java.util.Scanner;

public class Diamondstar {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int output= sc.nextInt();
        diamond(output);
    }
    static  void diamond(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("*");
            }
            for(int l=1;l<=(i-1);l++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int a=1;a<=n;a++){
            for(int b=1;b<=(a-1);b++){
                System.out.print(" ");
            }
            for(int c=1;c<=(n-a)+1;c++){
                System.out.print("*");
            }
            for(int d=1;d<=(n-a);d++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


/*
input:-
5

output:-

    *
   ***
  *****
 *******
*********
*********
 *******
  *****
   ***
    *

*/
