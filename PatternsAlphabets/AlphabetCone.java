package PatternsAlphabets;
import java.util.Scanner;
public class AlphabetCone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int output=sc.nextInt();
        AlphabetCone(output);
    }
    static void AlphabetCone(int n){
        int aplhs=65;
        for(int i=0;i<=n;i++){
            for(int j=0;j<=i;j++){
                System.out.print((char)(aplhs+j)+" ");
            }
            System.out.println();
        }
    }
}

/*
output
A
A B
A B C
A B C D
A B C D E
A B C D E F

*/
