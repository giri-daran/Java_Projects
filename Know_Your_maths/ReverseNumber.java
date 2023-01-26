package Know_Your_maths;
import java.util.Scanner;
public class ReverseNumber {
    public static void main(String[] args) {
        System.out.println("Enter the number to get its Reversed format ");
        Scanner sc=new Scanner(System.in);
        int output=sc.nextInt();
        reverseNumber(output);
    }
   static void reverseNumber(int u){
        int store=0;
        while (u!=0){
            int d=u%10;
            store=(store*10)+d;
            u=u/10;
        }
       System.out.println("The Reverse format is "+store);
   }
}
