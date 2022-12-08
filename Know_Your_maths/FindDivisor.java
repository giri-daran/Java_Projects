package Know_Your_maths;
import java.util.Scanner;
public class FindDivisor {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int y=sc.nextInt();
        divisor(y);
    }
    static void divisor(int n){
        for(int i=1;i<=n;i++){
            if(n%i==0){
                System.out.println(i);
            }
        }
    }
}
