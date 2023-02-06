package Know_Your_maths;

import java.util.Scanner;

public class FahrenheitToCelcius {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the temperature in Fahrenhiet ");
        float output=sc.nextFloat();
        conertfartocel(output);
    }
    static void conertfartocel(float n){
        float s= ((n-32)*5)/9;  //the formula for coverting fahrenheit to celcius
        System.out.println("the temperation from fahrenhiet to celcius is "+s);
    }
}

/*
input:-
Enter the temperature in Fahrenhiet 
132

output:-
55.5556
*/
