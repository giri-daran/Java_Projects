package Know_Your_maths;
import java.util.Scanner;

public class DivideTheNumberWithItsOwnDigits {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int output=sc.nextInt();
        N(output);
    }
    static void N(int M){
        int c=M;
        int w=0;
        while(c>0){
            int v=c%10;
            w=v;
            if(w!=0 && M%w==0){
                System.out.print(w+" ");
            }
            c=c/10;
        }
    }
}
