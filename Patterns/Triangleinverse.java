package Patterns;

import java.util.Scanner;

public class Triangleinverse {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int r= sc.nextInt();
        u(r);
    }
    static void u(int y){
        for(int i=1;i<=y;i++){
            for(int j=1;j<=(y-i)+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
