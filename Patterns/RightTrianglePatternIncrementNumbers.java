package Patterns;
import java.util.Scanner;
public class RightTrianglePatternIncrementNumbers {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int j=sc.nextInt();
        m(j);
    }
    static void m(int n){
        int h=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(h+" ");
                h++;
            }
            System.out.println();
        }
    }
}

/*
* output
1
2 3
4 5 6
7 8 9 10
11 12 13 14 15


* */