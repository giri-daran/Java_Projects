import java.util.*;

import java.util.Scanner;
public class VerticalPramid {
   public static void main(String[] args){
        Scanner fc = new Scanner(System.in);
        int h = fc.nextInt();
        n(h);
   }

   static void n(int t) {
     for(int i=1; i< 2*t; i++){
         int count = i;
         if(i>t){
             count = (2*t-i);
         }
         for(int j=1; j<=count; j++){
             System.out.print("*");
         }
         System.out.println();
     }
   }
}

//input 5
//output

*
**
***
****
*****
****
***
**
*
