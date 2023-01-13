package Hacker_rank;

import java.util.Scanner;

public class Javaoutputformatting {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++){
            String string=sc.next();
            int output=sc.nextInt();
            System.out.printf("%-15s%03d \n",string,output);
            //Complete this line
        }
        System.out.println("================================");

    }
}




