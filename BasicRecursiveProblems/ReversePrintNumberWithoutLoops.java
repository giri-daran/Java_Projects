package BasicRecursiveProblems;
import java.util.Scanner;
public class ReversePrintNumberWithoutLoops {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int k=sc.nextInt();
        ReverseprintLoop(k);
    }
    static void ReverseprintLoop(int M){
        if (M < 1) {
            return;
        }
        System.out.print(M+" ");
        ReverseprintLoop(M-1);

    }
}
