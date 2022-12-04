package Patterns;

import java.util.Scanner;
public class AlphabetLeftSidedCone {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int u=sc.nextInt();
        m(u);
    }
    static void m(int n){
        int apla=65;
        for(int i=0;i<=n;i++){
            for(int j=0;j<=i;j++){
                System.out.print((char)(apla+j)+" ");
            }

            System.out.println();
        }
        for(int l=1;l<=n;l++){
            for(int k=0;k<=n-l;k++){
                System.out.print((char)(apla+k)+" ");
            }
            System.out.println();
        }

    }
}
