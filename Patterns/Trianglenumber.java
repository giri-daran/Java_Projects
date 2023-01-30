package Patterns;

import java.util.Scanner;

public class Trianglenumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int output= sc.nextInt();
        TriangleNumber(output);
    }
    static void TriangleNumber(int t){
        for (int i=1;i<=t;i++){
            for (int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

/*
input:-
6

output:-

1
12
123
1234
12345
123456

*/
