/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Team6.Quiz1;

    import java.util.Scanner;
/**
 *
 * @author Mahdi
 */
public class Practice2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner input = new Scanner (System.in);
        /*
            ax+by=c
            dx+ey=f
        */
        double a, b, c, d, e, f, x, y;
        
        System.out.println("\tax+by=c \n\tdx+ey=f \nPlease enter coefficients(zarayeb) in a, b, c, d, e, f order: ");
        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();
        d = input.nextDouble();
        e = input.nextDouble();
        f = input.nextDouble();
        // Cramer's Rule
        x = ((c * e) - (b * f)) / ((a * e) - (b * d));
        y = ((a * f) - (d * c)) / ((a * e) - (b * d));
        
        System.out.println("x = " + x + ", " + "y = " + y );
        
    }
}
