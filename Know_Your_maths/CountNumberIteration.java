package Know_Your_maths;
import java.util.Scanner;
public class CountNumberIteration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int g= sc.nextInt();
        m(g);
    }
    static void m(int n){
        int f=0;
        while(n!=0){
            int v=n%10;
            f++;
            n=n/10;

        }
//        if(f>=3){
//            System.out.println(f+" the value is above 3");
//        }
//        else{
//            System.out.println(f+" the value is below 3");
//        }
        System.out.println("The number Length is "+f);
    }
}
