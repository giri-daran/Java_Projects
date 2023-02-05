package Know_Your_maths;
import java.util.Scanner;
public class Tables {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number for Tables ");
        int output1=sc.nextInt();
        System.out.println("Enter the number of limit in this Tables you need ");
        int output2= sc.nextInt();
        Tables(output1,output2);
    }
    static void Tables(int y, int u){
        for(int i=1;i<=u;i++){
            int value=y*i;
            System.out.println(y +" X " +i +" = "+value);
        }
    }
}

