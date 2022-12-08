package Know_Your_maths;

import java.util.Scanner;
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int u= sc.nextInt();
        m(u);
    }
    static void m(int n){
        //int sum=0;
        int rem=0;
        while(n!=0){
            int sum=n%10;
            rem=rem*10+sum;
            n=n/10;
        }
        System.out.println("The reversed Number is "+rem);
    }
}
