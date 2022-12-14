package Know_Your_maths;
import java.util.Scanner;

public class Gcd_Lcd {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int output=sc.nextInt();
        int output2=sc.nextInt();
        gcdlcd(output,output2);
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
