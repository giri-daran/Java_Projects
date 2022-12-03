package Patterns;
import java.util.Scanner;
public class Numbercone {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int v= sc.nextInt();
        g(v);
    }
    static void g(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
//            for(int k=1;k<=(n-i);k++){
//                System.out.print(" ");
//            }
//            for(int a=1;a<=(n-i);a++){
//                System.out.print(" ");
//            }
            for(int k=1;k<=2*(n-i);k++){
                System.out.print(" ");
            }

            for(int l=i;l>=1;l--){
                System.out.print(l);
            }
            System.out.println();
        }
    }
}
