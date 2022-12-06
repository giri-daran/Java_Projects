package Know_Your_maths;

import java.util.Scanner;

public class Palindorme {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int r=sc.nextInt();
        tt(r);
    }
    public static void tt(int y){
        int dup=y;
        int sum=0;
        while (y !=0){
            int r=y%10;
            sum=sum*10+r;
            y=y/10;
        }
        if(sum==dup){
            System.out.println("it is a palindrome");
        }
        else{
            System.out.println("it is not a palindorme");
        }
    }
}
