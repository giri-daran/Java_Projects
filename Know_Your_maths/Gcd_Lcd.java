package Know_Your_maths;
import java.util.Scanner;

public class Gcd_Lcd {
    public static void main(String[] args) {
        System.out.println("Type the number to get the GCD and LCD - ");
        Scanner sc= new Scanner(System.in);
        int output=sc.nextInt();
        int output2=sc.nextInt();
        gcdlcd(output,output2);
    }
    public static void gcdlcd(int a , int b){
       int mini =0;
        if(a>b){
            mini=b;
        } else{
            mini =a;
        }
        for(int i=1;i<=mini; i++){
            System.out.println(i);
            
        }
    }
}

/*
input:-
Type the number to get the GCD and LCD - 
45
76
output:-

1
2
3
4
5
6
7
8
9
10
11
12
13
14
15
16
17
18
19
20
21
22
23
24
25
26
27
28
29
30
31
32
3334
353637
38
39
40
41
42
4344
45

*/
