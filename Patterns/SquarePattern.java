package Patterns;
import java.util.Scanner;
public class SquarePattern {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int o=sc.nextInt();
        m(o);
    }
    static void m(int n){
        for (int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            for(int k=1;k<=(n-i);k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

/*
input:-
5

output:-

******
******
******
******
******

*/
