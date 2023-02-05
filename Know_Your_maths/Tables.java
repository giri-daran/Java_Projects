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

/*

input:-
Enter the number for Tables 
5
Enter the number of limit in this Tables you need 
6

output:-
5 X 1 = 5
5 X 2 = 10
5 X 3 = 15
5 X 4 = 20
5 X 5 = 25
5 X 6 = 30

*/
