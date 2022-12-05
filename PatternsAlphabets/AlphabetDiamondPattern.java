package PatternsAlphabets;

import java.util.Scanner;
public class AlphabetDiamondPattern {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int u=sc.nextInt();
        m(u);
    }
    static void m(int n){
        int alpha=65;
        for(int i=0;i<=n;i++){
            for(int j=0;j<=(n-i);j++){
                System.out.print((char)(alpha+j));
            }
            for(int k=0;k<=2*(i-1);k++){
                System.out.print(" ");
            }
            for(int l=0;l<=(n-i);l++){
                System.out.print((char)(alpha+l));
            }
            System.out.println();
        }
    }
}
