package Know_Your_Maths;
import java.util.Scanner;
public class NumberPrintWithNoLoopUsingRecursive {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int output=sc.nextInt();
        printwithoutLoops(output);
    }
    static void printwithoutLoops(int m){
        if(m==1){
            System.out.print(m+" ");
            return;
        }
        printwithoutLoops(m-1);
        System.out.print(m+" ");
    }
}
