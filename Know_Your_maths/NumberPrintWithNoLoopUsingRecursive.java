package Know_Your_Maths;
import java.util.Scanner;
public class NumberPrintWithNoLoopUsingRecursive {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int o=sc.nextInt();
        p(o);
    }
    static void p(int m){
        if(m==1){
            System.out.print(m+" ");
            return;
        }
        p(m-1);
        System.out.print(m+" ");
    }
}
