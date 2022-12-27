package PatternsAlphabets;
import java.util.Scanner;
public class AphabetConeReverse {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int output=sc.nextInt();
        AphabetConeReverse(output);
    }
    static void AphabetConeReverse(int n){
        for(int i=n;i>=1;i--){
            for(int j=n-1;j>=i-1;j--){
                System.out.print((char)('A' + j));
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}



/*

* input
5

* output
E
E D
E D C
E D C B
E D C B A

*/
