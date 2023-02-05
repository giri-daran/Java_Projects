package Know_Your_maths;
import java.util.Scanner;
public class Palindorme {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number to check for palindrome ");
        int a=sc.nextInt();
        palindrome(a);
    }
    public static void palindrome(int y){
        int duplicate=y;
        int sum=0;
        while (y !=0){
            int rem=y%10;
            sum=sum*10+rem;
            y=y/10;
        }
        if(sum==duplicate){
            System.out.println(sum+" is a palindrome");
        }
        else{
            System.out.println(sum+" is not a palindorme");
        }
    }
}

/*
input:-
Enter the number to check for palindrome 
567
---------------------------------------------
Enter the number to check for palindrome 
121

output:-
765 is not a palindorme
-----------------------------------------------
121 is a palindrome
*/
