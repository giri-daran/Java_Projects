package Know_Your_maths;
import java.util.Scanner;

public class Gcd_Lcd {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int ou=sc.nextInt();
        int ou2=sc.nextInt();
        gcdlcd(ou,ou2);
    }
    public static void gcdlcd(int a , int b){
       int mini =0;
        if(a>b){
            mini=b;
        } else{
            mini =a;
        }
        for(int i=1;i<=mini; i++){
            //System.out.println(i);
            
        }
    }
}
