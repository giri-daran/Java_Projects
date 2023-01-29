package Patterns;
import java.util.Scanner;
public class Numbers {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int output=sc.nextInt();
        NumberTriangle(output);
    }
    static void NumberTriangle(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}


/*
input:-
7

output:-

1
22
333
4444
55555
666666
7777777

*/
