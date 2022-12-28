package Patterns;

import java.util.Scanner;

public class Triangleinverse {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int output= sc.nextInt();
        Triangleinverse(output);
    }
    static void Triangleinverse(int y){
        for(int i=1;i<=y;i++){
            for(int j=1;j<=(y-i)+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
