package Know_Your_maths;

import java.util.Scanner;

public class Armstrong_number {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int output=sc.nextInt();
        armstrong(output);
    }
    static void armstrong(int n){
        int duplicate=n;
        int sum=0;
        while (n!=0){
            int rem=n%10;
            sum=sum+rem*rem*rem;
            n=n/10;
        }
        System.out.println(sum);
        if(duplicate==sum){
            System.out.println("This is a armstrong number");
        }
        else {
            System.out.println("This is not a armstrong number");
        }
    }
}


