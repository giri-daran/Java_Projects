package Patterns;
import java.util.Scanner;
public class Triangulate {
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
     int output=sc.nextInt();
     Triangulate(output);
    }
    static void Triangulate(int p){
        for(int i=1;i<=p;i++){
            for(int j=1;j<=i;j++){
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
**
***
****
*****

*/

    
