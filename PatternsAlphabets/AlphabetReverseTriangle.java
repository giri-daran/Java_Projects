package Patterns;

import  java.util.Scanner;
public class AlphabetReverseTriangle {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int u=sc.nextInt();
        m(u);
    }
    static void m(int n){
        int apla=65;
        for(int i=0;i<=n;i++){
            for(int j=0;j<=(n-i)-1;j++){
                System.out.print((char)(apla+j));
            }
            System.out.println();
        }
    }
}
