package Know_Your_maths;
import java.util.Scanner;
public class Armstrong_number {
    public static void main(String[] args) {
        System.out.println("Enter the value to get the Armstrong number ");
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


/*
input:-
Enter the value to get the Armstrong number 
370

output:-
370
This is a armstrong number

input:-
Enter the value to get the Armstrong number 
1643

output:-
308
This is not a armstrong number

*/
