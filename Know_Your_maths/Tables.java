package Know_Your_maths;

import java.util.Scanner;

public class Tables {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        int output1=sc.nextInt();
        int output2= sc.nextInt();
        tables(output1,output2);
    }
    static void tables(int y, int u){
        for(int i=1;i<=u;i++){
            int value=y*i;
            System.out.println(y +" X " +i +" = "+value);

        }
    }
}
