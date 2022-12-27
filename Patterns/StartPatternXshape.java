package Patterns;
import java.util.Scanner;
public class StartPatternXshape {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int g=sc.nextInt();
        star(g);
    }
    static void star(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int k=1;k<=2*(n-i);k++){
                System.out.print(" ");
            }
            for(int l=1;l<=i;l++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int a=1;a<=n;a++){
            for(int b=1;b<=(n-a);b++){
                System.out.print("*");
            }
            for(int c=1;c<=(2*a);c++){
                System.out.print(" ");
            }
            for(int d=1;d<=(n-a);d++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

/*

input
5

output

 *        *
 **      **
 ***    ***
 ****  ****
 **********
 ****  ****
 ***    ***
 **      **
 *        *

 */
