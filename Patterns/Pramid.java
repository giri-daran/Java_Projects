package Patterns;

import java.util.Scanner;

public class Pramid {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int output=sc.nextInt();
        pramid(output);
    }
    static void pramid(int n){
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
    }
}
