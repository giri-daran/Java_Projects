package PatternsAlphabets;

import java.util.Scanner;

public class AlphabetCone2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int b= sc.nextInt();
        m(b);
    }
    static void m(int n){
        int aplha=65;
        for(int i=0;i<=n;i++){
            for(int j=0;j<=i;j++){
                System.out.print((char) (aplha+i)+" ");
            }
            System.out.println();
        }
    }
}

//output
//        A
//        B B
//        C C C
//        D D D D
//        E E E E E
//        F F F F F F
//        G G G G G G G
