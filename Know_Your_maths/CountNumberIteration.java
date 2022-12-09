package Know_Your_maths;
import java.util.Scanner;
public class CountNumberIteration {
    public static void main(String[] args) {
         Scanner sc= new Scanner(System.in);
        int output= sc.nextInt();
        count(output);
    }
    static void count(int k){
        int duplicate=k;
        int Count=0;
        while(k!=0){
            int Number=k%10;
            Count++;
            k=k/10;
        }
       System.out.println("The count of iteration in number "+duplicate+" is "+Count);
   }
}
