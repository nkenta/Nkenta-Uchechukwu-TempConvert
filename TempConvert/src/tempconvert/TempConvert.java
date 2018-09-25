package tempconvert;

/**
 *
 * Nkenta Uchechukwu Ferdinand
 * Student: Brigham Young University
 * Course: CIT 260
 * Purpose: This simple Calculator is designed to help user calculate
 * basic temperature.
 */

import java.util.Scanner;
public class TempConvert
   {
         public static void main(String args []) 
        
        {
     Scanner scan = new Scanner(System.in);
         double temperature=0.0;
         double convert=0.0;
         {         
         System.out.println("Key in Temperature in Celcius.");
         temperature = scan.nextDouble();
         convert = 9.0/5.0*temperature+32.0;
         System.out.println("The Temperature in Fehrenheit is = "+ convert);
         }
         
        }
}
