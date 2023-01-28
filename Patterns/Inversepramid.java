package Patterns;
import java.util.Scanner;
public class Inversepramid {
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int output= sc.nextInt();
    inverPrmid(output);
    }
    static  void inverPrmid(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i-1;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=(n-i)+1;k++){
                System.out.print("*");
            }
            for(int l=1;l<=(n-i);l++){
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
*********
 *******
  *****
   ***
    *

*/
