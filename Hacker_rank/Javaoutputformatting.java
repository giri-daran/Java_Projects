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
/*
input1:-
kgf
132

input2:-
rr
123

input3:-
vikram
400

output:-
================================

kgf            132 

rr             123 

vikram         400 

================================

*/

//this program takes the input 3 times and print 3 values in this format and the loop breaks



