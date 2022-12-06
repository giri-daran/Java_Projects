package Know_Your_maths;

import java.util.Scanner;

public class Tables {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        int z=sc.nextInt();
        int r= sc.nextInt();
        tt(z,r);
    }
    static void tt(int y, int u){
        for(int i=1;i<=u;i++){
            System.out.println(y +"X" +i +"="+(y*i));

        }
    }
}
