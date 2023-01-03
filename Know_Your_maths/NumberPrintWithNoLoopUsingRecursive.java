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


/*
input:-
13

output:-
1 2 3 4 5 6 7 8 9 10 11 12 13
*/
