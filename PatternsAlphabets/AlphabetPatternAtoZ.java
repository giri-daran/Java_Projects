package PatternsAlphabets;

import java.util.Scanner;

public class AlphabetPatternAtoZ {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int r=sc.nextInt();
        m(r);
    }
    static void m(int n){
        int aplha=65;
        for(int i=0;i<=n;i++){
            for(int j=0;j<=i;j++){
                System.out.print((char)(aplha)+" ");
                aplha++;
            }
            System.out.println();
        }
    }
}

//output
//        A
//        B C
//        D E F
//        G H I J
//        K L M N O
//        P Q R S T U