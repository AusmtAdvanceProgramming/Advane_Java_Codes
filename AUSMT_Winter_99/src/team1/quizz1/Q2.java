/*
 Haniyeh Hadiyan -Hossein Rahi
 */
package team1.quizz1;

import java.util.Scanner;

public class Q2 {
    
   
    public static void main(String args[]) {
        
            Scanner input = new Scanner (System.in);
        
        
        
            double a, b, c, d, e, f, x, y;
        
            System.out.println("\tax+by=c \n\tdx+ey=f \nPlease enter coefficients(zarayeb) in a, b, c, d, e, f order: ");
            a = input.nextDouble();
            b = input.nextDouble();
            c = input.nextDouble();
            d = input.nextDouble();
            e = input.nextDouble();
            f = input.nextDouble();
        
            x = ((c * e) - (b * f)) / ((a * e) - (b * d));
            y = ((a * f) - (d * c)) / ((a * e) - (b * d));
        
            System.out.println("x = " + x + ", " + "y = " + y );
        
    }
  }
