package Know_Your_maths;

import java.util.Scanner;

public class FahrenheitToCelcius {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        float output=sc.nextFloat();
        conertfartocel(output);
    }
    static void conertfartocel(float n){
        float s= ((n-32)*5)/9;  //the formula for coverting fahrenheit to celcius
        System.out.println("the temperation from fahrenhiet to celcius is "+s);
    }
}
