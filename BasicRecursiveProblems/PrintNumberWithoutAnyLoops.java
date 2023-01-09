package BasicRecursiveProblems;
import java.util.*;
public class PrintNumberWithoutAnyLoops {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int o=sc.nextInt();
        PrintNoWithRecursive(o);
    }
    static void PrintNoWithRecursive(int n){
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        PrintNoWithRecursive(n-1);
        System.out.print(n+" ");
    }
}
