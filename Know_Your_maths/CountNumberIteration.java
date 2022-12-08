package Know_Your_maths;
import java.util.Scanner;
public class CountNumberIteration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int g= sc.nextInt();
        m(g);
    }
    static void m(int n){
        int finditeration=0;
        while(n!=0){
            int sum=n%10;
            finditeration++;
            n=n/10;

        }
        System.out.println("The number length is "+finditeration);
    }
}
