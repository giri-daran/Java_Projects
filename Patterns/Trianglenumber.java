package Patterns;

import java.util.Scanner;

public class Trianglenumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int h= sc.nextInt();
        c(h);
    }
    static void c(int t){
        for (int i=1;i<=t;i++){
            for (int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
