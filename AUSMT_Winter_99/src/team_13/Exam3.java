/*
 * Example 3
 */
package team_13;

import java.util.Scanner;

/**
 *
 * @author matrix
 */
public class Exam3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double farenheit;
        double celsius;
        
        Scanner input = new Scanner(System.in );
        
        System.out.print("Please enter  a degree in farenheit: ");
        farenheit = input.nextDouble();
        
        celsius = (5.0 / 9) * (farenheit - 32);
        
        System.out.println("Degree in " + farenheit + " farenheit is equal to " + celsius + " celsius");
        
        
    }// end of main() method
    
}//end of class


