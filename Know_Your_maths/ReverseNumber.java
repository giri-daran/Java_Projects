package Know_Your_maths;

import java.util.Scanner;
public class ReverseNumber {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        int output=sc.nextInt();
        reverse(output);
    }
   static void reverse(int u){
        //int duplicate=u;
        int store=0;
        while (u!=0){
            int d=u%10;
            store=(store*10)+d;
            u=u/10;
        }
       System.out.println("the reverse number is "+store);
   }
}
