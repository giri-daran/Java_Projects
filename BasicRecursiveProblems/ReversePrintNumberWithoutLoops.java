package BasicRecursiveProblems;
import java.util.Scanner;
public class ReversePrintNumberWithoutLoops {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int output=sc.nextInt();
        ReverseprintLoop(output);
    }
    static void ReverseprintLoop(int M){
        if (M < 1) {
            return;
        }
        System.out.print(M+" ");
        ReverseprintLoop(M-1);

    }
}


/*
input:-
10

output:-

10 9 8 7 6 5 4 3 2 1
*/


