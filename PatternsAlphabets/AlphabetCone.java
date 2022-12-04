package Patterns;
import java.util.Scanner;
public class AlphabetCone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int u=sc.nextInt();
        m(u);
    }
    static void m(int n){
        int aplhs=65;
        for(int i=0;i<=n;i++){
            for(int j=0;j<=i;j++){
                System.out.print((char)(aplhs+j)+" ");
            }
            System.out.println();
        }
    }
}
