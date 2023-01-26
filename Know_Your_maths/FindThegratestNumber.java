package Know_Your_maths;
import java.util.Scanner;
public class FindThegratestNumber {
   public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
     System.out.println("The program will take 3 values N, O, P , Lets start from N ");
     System.out.println("Enter the value of N ");
     int N=sc.nextInt();
     System.out.println("Enter the value of O ");
     int O=sc.nextInt();
     System.out.println("Enter the value of P ");
     int P=sc.nextInt();
     greatestnum(N,O,P);
    }
   static void greatestnum(int n,int o, int p){
    if(n>o && n>p){
      System.out.println("the value of N is the greatest of all 3 numbers");
    }
     else if(o>n && o>p){
      System.out.println("The value of O is the greatest of all 3 numbers");
     }
     else if(p>n && p>o){
      System.out.println("The value of P is the greatest of all 3 numbers");
     }
     else{
      System.out.println("All 3 values are either equal or not distict");
     }
   }
}

/*
input:-

The program will take 3 values N, O, P , Lets start from N 
Enter the value of N 
23
Enter the value of O 
34
Enter the value of P 
45

output:-

The value of P is the greatest of all 3 numbers


*/
