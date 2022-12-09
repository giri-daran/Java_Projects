package Know_Your_maths;
import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int output=sc.nextInt();
        prime(output);
    }
    static void prime(int m){
        for(int i=2;i<=m;i++){
            if(m%i==0){
                System.out.println("The reminder is 0 ,so Its not a Prime Number");
            }
            else{
                System.out.println("The reminder is not equal to 0, So its a prime Number");
            }
            return;
        }
    }
}
