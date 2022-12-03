package Patterns;

import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int g= sc.nextInt();
        sq(g);
    }
    static void sq(int y){
        for(int i=1;i<=y;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int k=0;k<=(y-i);k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
